#ifndef SFMLSET_DROPDOWN_H
#define SFMLSET_DROPDOWN_H

#include "Itemlist.h"
#include "InputBox.h"
#include "History.h"
#include "GUIComponents.h"

class DropDown: public GUIComponents{
private:
    /* data */
    Itemlist menu;
    SnapShot snap;
    // InputBox box;
    InputBox input;
    float x, y;
public:
    DropDown();
    DropDown(vector<string> vec);  // given list of string
    
    void setPosition(float x, float y);
    virtual void draw(sf::RenderTarget& window, sf::RenderStates states) const;
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void update();
    
    SnapShot& getSnapShot();
    void applySnapshot(const SnapShot& snapshot);
};

#endif