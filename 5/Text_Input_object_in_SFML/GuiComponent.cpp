//
// Created by lenovo on 2021/4/9.
//

#include "GuiComponent.h"

void Gui::addEventHandler(sf::RenderWindow &window, sf::Event event) {
    type.addEventHandler(window,event);
    box.addEventHandler(event);
}

void Gui::draw(sf::RenderWindow &window) {
    box.draw(window);
    type.draw(window);
    cursor.draw(window);
}