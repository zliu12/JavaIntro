#include "Menu.h"

Menu::Menu(/* args */){
    x = 0;
    y = 0;
}

void Menu::itemSet(string data){
    input.setPosition(x, y);
    input.setText(data);
}

void Menu::itemlistSet(vector<string> vector){
    // list.setPosition(0, input.getLocalBounds().height + 5);
    for(int i = 0; i < vector.size(); i++){
        list.Insert(vector.at(i));
    }
}

void Menu::draw(sf::RenderTarget& window, sf::RenderStates states) const{
    window.draw(input);
    if(State::isStateEnabled(State::BAR)){
        if(menu == inputdata){
            cout << string(menu) << endl;
            window.draw(list);
        }
    }
}

void Menu::addEventHandler(sf::RenderWindow& window, sf::Event event){

    if(MouseEvents<InputBox>::mouseClicked(input, window)){
        
        if(State::isStateEnabled(State::BAR)){
            State::setStateEnable(State::BAR, false);
        }
        else
            State::setStateEnable(State::BAR, true);
        
        cout << "Menu Show state (0-F, 1-T)" << State::isStateEnabled(State::BAR) << endl;
    }
    
    if(State::isStateEnabled(State::BAR)){
        State::setStateEnable(State::KEEP, true);
        // if(MouseEvents<Item>::hovered(i, window)){
            list.addEventHandler(window, event);
        // }
        if(MouseEvents<InputBox>::hovered(input, window)){
            menu = input.getText();
        }
    }
}

void Menu::setPosition(float x, float y){
    this->x = x;
    this->y = y;
    input.setPosition(x, y);
    list.setPosition(x, y + input.getLocalBounds().height + 5);
}

sf::String Menu::getMenu(){
    return menu;
}
void Menu::update(){
    inputdata = input.getText();
    if(menu == inputdata){
        State::setStateEnable(State::KEEP, true);
    }else {
        State::setStateEnable(State::KEEP, false);
    }
}

sf::String Menu::getInputBox(){
    return input.getText();
}

InputBox Menu::hov(){
    return input;
}

void Menu::menuSet(sf::String m){
    menu = m;
}
