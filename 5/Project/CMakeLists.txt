cmake_minimum_required(VERSION 3.17)
project(Project)

set(CMAKE_CXX_STANDARD 14)

add_executable(Project main.cpp History.cpp History.h TextInput.cpp TextInput.h MouseEvents.cpp MouseEvents.h GUIComponent.cpp GUIComponent.h SnapShot.cpp SnapShot.h Keyboard.cpp Keyboard.h EventHandler.cpp EventHandler.h States.cpp States.h Stack.cpp Stack.h Typing.cpp Typing.h Cursor.cpp Cursor.h Node_iterator.cpp Node_iterator.h Label.cpp Label.h TextColor.cpp TextColor.h MultiText.cpp MultiText.h)
target_link_libraries(Project sfml-graphics sfml-audio)

find_package(SFML 2.5 COMPONENTS graphics audio REQUIRED)