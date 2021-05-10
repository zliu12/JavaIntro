//
// Created by lenovo on 2021/4/10.
//

#include "TextInput.h"

TextInput::TextInput() {
    font.loadFromFile("../OpenSans-Bold.ttf");
    text.setFont(font);
    text.setCharacterSize(25);
    text.setPosition(10,55);
    text.setFillColor(sf::Color::Black);
}

sf::Text TextInput::getColotText(sf::String str) {
    int start=0;

    for (int i = 0; i < str.getSize(); i++) {
        if (isOperator(str, i)) {
            if(isSpecialWord(str, start, i)) {
                text.setFillColor(sf::Color::Blue);

            }
        }
    }
}

bool TextInput::isSpecialWord(sf::String str, int begin, int stop) {
    if (str.substring(begin, stop) == "int")
        return true;
    else if (str.substring(begin, stop) == "char")
        return true;
    else if (str.substring(begin, stop) == "double")
        return true;
    else if (str.substring(begin, stop) == "float")
        return true;

    return false;
}

bool TextInput::isOperator(sf::String str, int index) {
    if (str.substring(index, index+1) == "<")
        return true;
    else if (str.substring(index, index+1) == ">")
        return true;
    else if (str.substring(index, index+1) == "/")
        return true;
    else if (str.substring(index, index+1) == "\"")
        return true;
    else if (str.substring(index, index+1) == ";")
        return true;

    return false;
}