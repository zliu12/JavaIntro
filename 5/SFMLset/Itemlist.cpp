
#include "Itemlist.h"

Itemlist::Itemlist(){
    y = 0.f;
    size = list.Size();
}

Itemlist::Itemlist(vector<string> vector){
    for(int i = 0; i < vector.size(); ++i){
        Insert(vector.at(i));
    }
    size = list.Size();
};


void Itemlist::setPosition(float x, float y){
    // this->x = x;
    this->y = y;
    int index = 0;
    LinkedList<Item>::iterator iter;
    for(iter = list.begin(); iter != list.end(); ++iter){
        iter.current->data.Position(x, y + index * 100);
        ++index;
        // cout << "list Position Set: " << x << " " << y + index * 100 << endl;
    }
    
}

void Itemlist::Insert(sf::String i){
    Item item;
    item.String(i);
    y += 100.f;
    item.Position(0.f, y);
    list.insertAfter(item);
}

void Itemlist::addEventHandler(sf::RenderWindow& window, sf::Event event){
    LinkedList<Item>::iterator iter = list.begin();

    for(; iter != list.end(); ++iter){
        if(MouseEvents<Item>::hovered(*iter, window)){
            iter.current->data.setColor(sf::Color::Blue);
            string data = iter.current->data.getString();
            // cout << data << endl;
        }else{
            iter.current->data.setColor(sf::Color::Transparent);
        }
        
        if(MouseEvents<Item>::mouseClicked(*iter, window)){
            // if mouse clicked on an option, closed the bar
            // set clicked state to be true
            State::setStateEnable(State::APPEAR, false);
            State::setStateEnable(State::CLICKED, true);
            State::setStateEnable(State::BAR, false);
            chose = iter.current->data.getString();
            cout << chose << endl;
        }
    }
}

void Itemlist::draw(sf::RenderTarget& window, sf::RenderStates states) const{
    LinkedList<Item> ::iterator iter = list.begin();
    for(;iter != list.end(); ++iter){
        window.draw(*iter);
    }
}

string Itemlist::getClicked(){
    return chose;
}