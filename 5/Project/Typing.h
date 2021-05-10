
#ifndef PROJECT_TYPING_H
#define PROJECT_TYPING_H
#include <SFML/Graphics.hpp>
#include "States.h"
 #include"Cursor.h"

class Typing: public sf ::Drawable, public sf::Transformable{
private:
    sf:: Text text;
    sf::Font font;
    std::string str;
    sf:: RectangleShape box;
    sf::Text label;
//    sf::Texture texture;
     Cursor cursor;


public:
    Typing();
//    void setText();
    void update();
    virtual void draw(sf::RenderTarget& window, sf::RenderStates states) const;
   // sf::FloatRect getGlobalBounds();
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void setPosition();


    sf::FloatRect getGlobalBounds();


};


#endif //PROJECT_TYPING_H
