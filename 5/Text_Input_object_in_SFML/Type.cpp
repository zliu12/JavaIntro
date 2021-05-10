//
// Created by lenovo on 2021/4/9.
//

#include "Type.h"

Type::Type() {
    font.loadFromFile("../OpenSans-Bold.ttf");
    text.setFont(font);
    text.setCharacterSize(25);
    text.setPosition(10,55);
    text.setFillColor(sf::Color::Black);

    history.pushHistory("");
}

void Type::addEventHandler(sf::RenderWindow &window, sf::Event event) {
    if (event.type == sf::Event::TextEntered){
        std::cout << event.text.unicode << " ";

        if (!history.emptyHistory())
            input = history.topHistory();

        if (event.text.unicode < 128 && event.text.unicode > 31) {
            input += event.text.unicode;

            history.pushHistory(input);
            text.setString(history.topHistory());
        }
        else if(event.text.unicode == 8 && !input.isEmpty())
        {
            input = input.substring(0, input.getSize()-1);

            history.pushHistory(input);
            text.setString(history.topHistory());
        }
        else if (event.text.unicode == 26  && history.sizeHistory() > 1)
        {
            history.popHistory();

            text.setString(history.topHistory());
        }
        else if (event.text.unicode == 13){
            input += "\n";

            history.pushHistory(input);
            text.setString(history.topHistory());
        }


        if (event.text.unicode > 47 && event.text.unicode <= 57)
            text.setFillColor(sf::Color::Blue);
        else if (event.text.unicode <= 47 && event.text.unicode > 32)
            text.setFillColor(sf::Color::Green);
        else text.setFillColor(sf::Color::Black);
    }
}

void Type::update() {

}

void Type::draw(sf::RenderWindow& window) {
    window.draw(text);
}