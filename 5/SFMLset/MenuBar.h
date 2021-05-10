#ifndef SFMLSET_MENUBAR_H
#define SFMLSET_MENUBAR_H

#include "Menu.h"
#include <list>
#include "LinkedList.h"
#include "GUIComponents.h"

class MenuBar : public GUIComponents{
private:
    /* data */
    LinkedList<Menu> bar;
    // Menu menu;
    float x, y;
    string menu;
public:
    MenuBar(vector<string> vector);
    virtual void draw(sf::RenderTarget& window, sf::RenderStates states) const;
    void addEventHandler(sf::RenderWindow& window, sf::Event event);
    void update();

};


#endif