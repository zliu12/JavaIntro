#include "Cursor.h"
#include"Typing.h"

Cursor::Cursor() {
    font.loadFromFile("OpenSans-Bold.ttf");
    textCursor.setFont(font);
    textCursor.setString("|");
    textCursor.setFillColor(sf::Color::White);
    textCursor.setCharacterSize(50);
    textCursor.setPosition({ 200, 300});
    textCursor.setOutlineThickness(20.f);
//    textCursor.setString();

}
void Cursor::addEventHandler(sf::RenderWindow window,sf::Event event ){
  //  cursor.setSize((sf::Vector2f(10.f,100.f)));
    cursor.setFillColor(sf::Color ::White);
}
void Cursor::toggleBlinkStates(){
    m_blinkState = !m_blinkState;
}

void Cursor::setSize(sf::Vector2f size){
    cursor.setSize((sf::Vector2f(10.f,100.f)));
}
void Cursor::setPosition(sf::Vector2f position){


   textCursor.setPosition(position);

//   position.x=180;
//   position.y=280;

 cursor.setPosition(200, 300);






}
void Cursor::update(){


    // Blinking Text

    if (clock.getElapsedTime().asSeconds() < 0.1)
    {
        textCursor.setFillColor(sf::Color::White);
        textCursor.setOutlineThickness(0.5);
    }
    if (clock.getElapsedTime().asSeconds() > 0.5)
    {
        textCursor.setFillColor(sf::Color::Transparent);
        textCursor.setOutlineThickness(1.f);
        if (clock.getElapsedTime().asSeconds() > 1)
            clock.restart().asSeconds();
    }


}
void Cursor::draw(sf::RenderTarget& window, sf::RenderStates states) const {
    if(m_blinkState){
        window.draw(cursor,states);
    }
    window.draw(textCursor);


}
sf::FloatRect Cursor::getGlobalBounds(){
    return cursor.getGlobalBounds();
}