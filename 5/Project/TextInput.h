#ifndef PROJECT_TEXTINPUT_H
#define PROJECT_TEXTINPUT_H
#include <SFML/Graphics.hpp>
#include "SnapShot.h"
#include "Typing.h"
//#include "Cursor.h"


class TextInput :  public sf ::Drawable, public sf::Transformable{
private:
    Cursor cursor;
    sf::Text textbox;
    Typing typing;
    //std::string getText;
public:
    TextInput();
    void update();
   // std::string getText;
    void draw(sf::RenderTarget& window, sf::RenderStates states)const;
    void addEventHandler(sf::RenderWindow &window, sf::Event event);
    sf::FloatRect getGlobalBounds();
    void setPosition(sf::Vector2f position);
 //  void applySnapShot(const SnapShot& snapshot);


};

#endif //PROJECT_TEXTINPUT_H
