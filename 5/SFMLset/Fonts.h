
#ifndef SFMLSET_FONTS_H
#define SFMLSET_FONTS_H
#include <SFML/Graphics.hpp>
#include <vector>
#include <iostream>
#include <cstdlib>

class Fonts {
public:
    static sf::Font font;
    static sf::Font& getFont();
private:
    static void loadFont();
    static bool fontload;
};


#endif //SFMLTYPING_FONTS_H
