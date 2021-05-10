#include "MenuBar.h"

MenuBar::MenuBar(vector<string> vector){
    x=0;
    y=0;
    for(int i=1; i<5; i++){
        string s = "Menu" + to_string(i);
        Menu menu;
        menu.itemSet(s);
        menu.itemlistSet(vector);
        menu.setPosition(x,y);
        // cout << "Menu Set" << endl;
        // cout << x << " " << endl;
        bar.insertAfter(menu);
        x += 500;
    }
}

void MenuBar::draw(sf::RenderTarget& window, sf::RenderStates states) const{

    LinkedList<Menu> ::iterator iter = bar.begin();
        for(;iter != bar.end(); ++iter){
            window.draw(*iter);
        }
}

void MenuBar::addEventHandler(sf::RenderWindow& window, sf::Event event){
    LinkedList<Menu> ::iterator iter = bar.begin();
    for(;iter != bar.end(); ++iter){
        iter.current->data.menuSet(menu);
        iter.current->data.addEventHandler(window,event);
        iter.current->data.update();
        menu = iter.current->data.getMenu();
    }
}

void MenuBar::update(){
}