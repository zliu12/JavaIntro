
#ifndef PROJECT_MULTITEXT_H
#define PROJECT_MULTITEXT_H

#include <SFML/Graphics.hpp>

class MultiText {
private:
    sf::Font font;
   sf:: Text type;


public:
    MultiText();
    sf::FloatRect getGlobalBounds();

};


#endif //PROJECT_MULTITEXT_H
