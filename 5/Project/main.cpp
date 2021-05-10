#include <SFML/Graphics.hpp>
#include <iostream>
#include"Typing.h"
#include "Cursor.h"
#include "TextInput.h"

int main() {
    sf::RenderWindow window(sf::VideoMode(1800, 1000, 32), "Test");
    Typing typing;
    Cursor cursor;

    while(window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();
            typing.addEventHandler(window, event);

        }
        typing.update();
        cursor.update();

        window.clear(sf::Color::Black);
        window.draw(typing);
        window.draw(cursor);
    //    window.draw(textInput);

        window.display();
    }

    return 0;
}
