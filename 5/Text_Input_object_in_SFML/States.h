//
// Created by lenovo on 2021/4/11.
//

#ifndef TEXT_INPUT_OBJECT_IN_SFML_STATES_H
#define TEXT_INPUT_OBJECT_IN_SFML_STATES_H

#include <map>

class States {
public:
    enum ObjectStates {
        HIDDEN, ENABLED, BLINKING, NEW_STATE,

        LASTSTATE
    };
    States();
    bool isStateEnable(ObjectStates state);
    void enableState(ObjectStates state);
    void disableState(ObjectStates state);

private:
    std::map<ObjectStates, bool> states;
};

#include "States.cpp"

#endif //TEXT_INPUT_OBJECT_IN_SFML_STATES_H
