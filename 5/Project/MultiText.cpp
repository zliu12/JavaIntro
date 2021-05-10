

#include "MultiText.h"
MultiText::MultiText() {
    font.loadFromFile("OpenSans-Bold.ttf");
    type.setFont(font);
    type.setFillColor(sf::Color::White);
    type.setCharacterSize(50);
    type.setStyle(sf::Text::Bold);

}
sf::FloatRect MultiText:: getGlobalBounds(){

}