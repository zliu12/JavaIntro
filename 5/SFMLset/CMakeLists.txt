set(CXX_STANDARD 14)

cmake_minimum_required(VERSION 3.17)
project(SFMLset)

set(CMAKE_CXX_STANDARD 14)

add_executable(SFMLset main.cpp MyClass.cpp MyClass.h Typing.cpp Typing.h Input.h Input.cpp 
                Word.h Word.cpp SnapShot.cpp SnapShot.h History.cpp History.h Title.h Title.cpp Cursor.h Cursor.cpp
                Node.h Box.h State.h Fonts.cpp Fonts.h Item.h Item.cpp Itemlist.h Itemlist.cpp
                LinkedList.cpp LinkedList.h Iterator.cpp Iterator.h MouseEvent.h DropDown.cpp DropDown.h
                InputBox.cpp InputBox.h State.h State.cpp GUIComponents.h Menu.h Menu.cpp MenuBar.h MenuBar.cpp)

target_link_libraries(SFMLset sfml-graphics sfml-audio)

find_package(SFML 2.5 COMPONENTS graphics audio REQUIRED)
