#include "States.h"
#include <SFML/Graphics.hpp>

States:: States()
{
    for(int i=0; i<LASTSTATE;i++)
    {
        states[static_cast<ObjectState>(i)]= false;
    }
}
bool States::isStateEnable(ObjectState state)
{
if(states.count(state)>0)
    return states[state];
    return false;
}
bool States::enableState(ObjectState state){
    states[state]=true;
}


bool States:: disableState(ObjectState state){
    states[state]= false;
}
