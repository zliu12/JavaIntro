#ifndef SFMLSET_INPUTBOX_H
#define SFMLSET_INPUTBOX_H

#include <iostream>
#include <SFML/Graphics.hpp>
#include "State.h"
#include "Fonts.h"
using namespace std;

class InputBox: public sf::Drawable, public sf::Transformable{
public:
    InputBox(string msg, sf::Vector2f vec, sf::Color color);
    InputBox(string msg);
    InputBox();
    void setText(string msg);
    sf::FloatRect getLocalBounds();
    sf::String getText();
    void setSize(float x, float y);
    void setPosition(float x, float y);

    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void draw(sf::RenderTarget& window, sf::RenderStates states) const;
    
private:
    // sf::Font font;
    sf::Text text;
    sf::RectangleShape box;
};

#endif 