//
// Created by lenovo on 2021/4/11.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_CURSOR_H
#define TEXT_INPUT_OBJECT_IN_SFML_CURSOR_H

#include <sfml/graphics.hpp>
#include <iostream>
#include "Type.h"
#include "States.h"
using namespace std;

class Cursor : public States {
private:
    sf::RectangleShape cursor;
    sf::Clock timer;

public:
    Cursor();
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void update();
    virtual void draw(sf::RenderTarget& window) const;
    void setPosition(int x, int y);
    void setSize(sf::Vector2f size);
    void setColor(sf::Color c);
};

#include "Cursor.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_CURSOR_H
