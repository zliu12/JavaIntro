

#ifndef PROJECT_STATES_H
#define PROJECT_STATES_H
#include <SFML/Graphics.hpp>
#include"Cursor.h"
//#include"Typing.h"
enum ObjectState{
    HIDDEN,
    HIGHLIGHTED,
    BLINKING,
    DISABLED,
    //This should always be the last state
    LASTSTATE,
};
class States {
private:
    std::map<ObjectState, bool> states;
public:
    States();
    bool isStateEnable(ObjectState state);
    bool enableState(ObjectState state);
    bool disableState(ObjectState state);

};


#endif //PROJECT_STATES_H
