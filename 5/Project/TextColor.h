
#ifndef PROJECT_TEXTCOLOR_H
#define PROJECT_TEXTCOLOR_H
#include <SFML/Graphics.hpp>

class TextColor {
private:
    sf::Font font;
    sf::Text text;

public:
    TextColor();
    void setText();
    void addEventHandler(sf::RenderWindow window,sf::Event event );

};


#endif //PROJECT_TEXTCOLOR_H
