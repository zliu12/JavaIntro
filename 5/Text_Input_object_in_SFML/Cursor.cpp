//
// Created by lenovo on 2021/4/11.
//

#include "Cursor.h"

Cursor::Cursor() {
    cursor.setFillColor(sf::Color::White);
    disableState(BLINKING);
}

void Cursor::addEventHandler(sf::RenderWindow& window, sf::Event event) {

}

void Cursor::update() {
    if (timer.getElapsedTime() >= sf::milliseconds(500))
    {
        timer.restart();

        if (isStateEnable((BLINKING))) {
            cursor.setFillColor(sf::Color::Black);
            disableState(BLINKING);
        }
        else {
            cursor.setFillColor(sf::Color::White);
            disableState(BLINKING);
        }
    }
}

void Cursor::draw(sf::RenderTarget& window) const {
    window.draw(cursor);
}

void Cursor::setPosition(int x, int y) {
    cursor.setPosition(x, y);
}

void Cursor::setSize(sf::Vector2f size) {
    cursor.setSize(size);
}

void Cursor::setColor(sf::Color c) {
    cursor.setFillColor(c);
}