//#ifndef PROJECT_HISTORY_H
//#define PROJECT_HISTORY_H
//#include <SFML/Graphics.hpp>
//#include "GUIComponent.h"
//#include "SnapShot.h"
//#include "History.h"
//
//
//
//class History {
//private:
//    static std::stack<Snapshot> stack;
//    static std::map<std::string, GUIComponent*> components;
//public:
//    struct Response{
//        bool found = false;
//        GUIComponent* component;
//    };
//    static void pushHistory(const Snapshot& snapshot);
//    static Snapshot& topHistory();
//    static void popHistory();
//    static void addEventHandler(sf::RenderWindow& window, sf::Event event);
//    static Response& getComponent(std::string componentID);
//    static void addComponent(std::string componentID, GUIComponent* component);
//};
//
//
//#endif //PROJECT_HISTORY_H
