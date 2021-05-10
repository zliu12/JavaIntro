#include "TextInput.h"
#include <iostream>
TextInput::TextInput(){

}
void TextInput::update() {

    typing.update();

    cursor.update();


}
void TextInput::draw(sf::RenderTarget& window, sf::RenderStates states)const {
    {
        window.draw(textbox);
        //    window.draw(cursor,states);
    window.draw(typing);
    window.draw(cursor);

    }
}
//    sf::FloatRect TextInput::getGlobalBounds() {
//        return textbox.getGlobalBounds();
//    }

    void TextInput::setPosition(sf::Vector2f position) {

        textbox.setPosition(position);
    }
    void TextInput::addEventHandler(sf::RenderWindow &window, sf::Event event) {
        // sf:: FloatRect = type.getGlobalBounds();
        //  if(MouseEvents<)

      //  text.addEventHandler(window,event);


    }
    //void TextInput::applySnapShot(const SnapShot& snapshot){}

