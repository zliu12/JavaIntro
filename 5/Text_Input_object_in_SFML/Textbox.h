//
// Created by lenovo on 2021/4/9.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_TEXTBOX_H
#define TEXT_INPUT_OBJECT_IN_SFML_TEXTBOX_H

#include <sfml/graphics.hpp>

class textbox{
private:
    sf::RectangleShape textBox;
    sf::Font font;
    sf::Text text;
    int box_height = 40;
    int box_width = 500;

public:
    textbox();
    void draw(sf::RenderTarget& window);
    void addEventHandler(sf::Event event);
    };

#include "Textbox.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_TEXTBOX_H
