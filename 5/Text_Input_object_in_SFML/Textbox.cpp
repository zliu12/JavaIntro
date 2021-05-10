//
// Created by lenovo on 2021/4/9.
//

#include "Textbox.h"

textbox::textbox(){
    font.loadFromFile("../OpenSans-Bold.ttf");
    text.setFont(font);
    text.setCharacterSize(25);
    text.setString("Text input:");
    text.setPosition(10,20);
    text.setFillColor(sf::Color::Black);

    textBox.setOutlineColor(sf::Color::Black);
    textBox.setOutlineThickness(2);
    textBox.setFillColor(sf::Color::White);
    textBox.setSize(sf::Vector2f(box_width,box_height));
    textBox.setPosition(10,50);
}

void textbox::draw(sf::RenderTarget& window){
    window.draw(textBox);
    window.draw(text);
}

void textbox::addEventHandler(sf::Event event) {
    if (event.text.unicode == 13){
        box_height+=40;
        textBox.setSize(sf::Vector2f(box_width,box_height));
    }
}