#include <iostream>
#include "GuiComponent.h"


int main() {
    sf::RenderWindow window(sf::VideoMode(800, 600),"Text Input");
    Gui interface;
    while(window.isOpen())
    {
        sf::Event event;
        while(window.pollEvent(event)){
            if (event.type == sf::Event::Closed){
                window.close();
            }
            interface.addEventHandler(window,event);
        }
        window.clear(sf::Color::White);
        interface.draw(window);
        window.display();
    }

    return 0;
}