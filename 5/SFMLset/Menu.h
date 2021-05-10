#ifndef SFMLSET_MENU_H
#define SFMLSET_MENU_H

// #include <iostream>
// #include <SFML/Graphics.hpp>
#include "Itemlist.h"
#include "Item.h"
#include "InputBox.h"
#include "History.h"
#include "GUIComponents.h"
using namespace std;

class Menu: public sf::Transformable, public sf::Drawable{
private:
    /* data */
    // Item i;
    Itemlist list;
    InputBox input;
    // SnapShot snap;
    float x, y;
    bool hid;
    sf::String menu;
    sf::String inputdata;
    // string check;
public:
    Menu(/* args */);

    void itemSet(string data);
    void itemlistSet(vector<string> vector);
    void setPosition(float x, float y);
    sf::String getMenu();
    sf::String getInputBox();
    InputBox hov();
    void menuSet(sf::String m);

    virtual void draw(sf::RenderTarget& window, sf::RenderStates states) const;
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void update();

    // SnapShot& getSnapShot();
    // void applySnapshot(const SnapShot& snapshot);
};


#endif