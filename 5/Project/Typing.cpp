
#include "Typing.h"
#include<iostream>

Typing::Typing(){
    if(!font.loadFromFile("OpenSans-Bold.ttf")){
        std::cout<<"Error loading file"<<std::endl;
        system("Pause");
    }
    text.setFont(font);
    text.setCharacterSize(50);
    text.setFillColor(sf::Color::Red);
    text.setStyle((sf::Text::Style::Bold));
    str = " ";
    text.setString(str);
    text.setPosition(200,300);

    label.setFont(font);
    label.setFillColor(sf::Color::White);
    label.setCharacterSize(40);
    label.setStyle((sf::Text::Style::Bold));
    label.setString("Label Input:");
    label.setPosition(160,220);

    box.setOutlineColor(sf::Color::White);
    box. setPosition(50, 100);
//      box.setTexture(sf::Color::Black);
    box.setSize(sf::Vector2f(650.f, 150.f));
    box.setPosition(200,300);


    box.setOutlineThickness(4.f);
    box.setFillColor(sf::Color :: Transparent);




}

void  Typing ::setPosition() {
//    box.setOutlineColor(sf::Color::White);
//    box. setPosition(50, 100);
//
//    box.setSize(sf::Vector2f(650.f, 100.f));
//    box.setPosition(200,300);
//    box.setOutlineThickness(4.f);
//    box.setFillColor(sf::Color :: Transparent);


}
void Typing :: addEventHandler(sf::RenderWindow &window, sf::Event event) {
    if (event.type == sf::Event::TextEntered) {
        if (event.text.unicode == 8 || event.text.unicode == 46) {
            str = str.substr(0, str.size() - 1);
//                std::cout<< str;
            str += "\n";
            str = str.substr(0, str.size() - 1);

        } else if (event.text.unicode < 128) {
//             std::cout<< " "<< static_cast<char>(event.text.unicode);

            str += static_cast<char>(event.text.unicode) ;
            text.setString(str);

        }

    }
}

    void Typing::update(){

      text.setString(str);


    }
void Typing::draw(sf::RenderTarget& window, sf::RenderStates states) const{
    window.draw(box);
    window.draw(text,states);
    window.draw(cursor);
    window.draw(label);


}

sf::FloatRect Typing::getGlobalBounds()
{
    return text.getGlobalBounds();

}