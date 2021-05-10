//
// Created by lenovo on 2021/4/9.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_HISTORY_H
#define TEXT_INPUT_OBJECT_IN_SFML_HISTORY_H

#include <stack>
using namespace std;

class History {
private:
    stack<string> stackString;

public:
    void pushHistory(string str);
    string topHistory();
    void popHistory();
    bool emptyHistory();
    int sizeHistory();
    //static void addEventHandler(sf::RenderWindow& window, sf::Event event);
};

#include "History.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_HISTORY_H
