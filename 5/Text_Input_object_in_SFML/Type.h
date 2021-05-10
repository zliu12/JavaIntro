//
// Created by lenovo on 2021/4/9.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_TYPE_H
#define TEXT_INPUT_OBJECT_IN_SFML_TYPE_H

#include "EventHandler.h"
#include "History.h"
#include "TextInput.h"
#include <iostream>

class Type : EventHandle{
private:
    sf::Font font;
    sf::Text text;
    sf::String input;
    History history;

public:
    Type();
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void update();
    void draw(sf::RenderWindow& window);
};

#include "Type.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_TYPE_H
