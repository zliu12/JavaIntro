#ifndef PROJECT_CURSOR_H
#define PROJECT_CURSOR_H
#include <SFML/Graphics.hpp>
#include "States.h"
#include "SnapShot.h"


class Cursor :public  sf ::Drawable{ // public GraphicComponent
private:
    sf::RectangleShape cursor;
    sf::Clock clock;
    int blinkSpeed=500;
    void toggleBlinkStates();
    bool m_blinkState;
    sf::Text textCursor;
    sf::Font font;

public:
    Cursor();
    virtual  void draw(sf::RenderTarget& window, sf::RenderStates states) const  ;
    sf::FloatRect  getGlobalBounds();
    void update();
    void setSize(sf::Vector2f size);
    void setPosition(sf::Vector2f position);
    void addEventHandler(sf::RenderWindow window,sf::Event event);

};

#endif //PROJECT_CURSOR_H