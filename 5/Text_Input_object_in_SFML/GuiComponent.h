//
// Created by lenovo on 2021/4/9.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_GUICOMPONENT_H
#define TEXT_INPUT_OBJECT_IN_SFML_GUICOMPONENT_H

#include "Textbox.h"
#include "Type.h"
#include "Cursor.h"
//#include "Stack.h"
#include <stack>

class Gui{
private:
    textbox box;
    Type type;
    Cursor cursor;
    //std::stack<int> s;
public:
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void draw(sf::RenderWindow& window);

};

#include "GuiComponent.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_GUICOMPONENT_H
