//
// Created by lenovo on 2021/4/10.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_TEXTINPUT_H
#define TEXT_INPUT_OBJECT_IN_SFML_TEXTINPUT_H

#include "ColorText.h"

class TextInput {
private:
    sf::Font font;
    sf::Text text;

public:
    TextInput();
    sf::Text getColotText(sf::String str);
    bool isSpecialWord(sf::String str, int begin, int stop);
    bool isOperator(sf::String str, int index);
};

#include "TextInput.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_TEXTINPUT_H
