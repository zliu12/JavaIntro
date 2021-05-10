//
// Created by lenovo on 2021/4/9.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_EVENTHANDLER_H
#define TEXT_INPUT_OBJECT_IN_SFML_EVENTHANDLER_H

#include <sfml/graphics.hpp>

class EventHandle {
public:
    virtual  void addEventHandler(sf::RenderWindow& window, sf::Event event)=0;
    virtual  void update() = 0;
};

#include "EventHandler.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_EVENTHANDLER_H
