
#ifndef LINKEDLIST_TEMPLATE_NODE_ITERATOR_H
#define LINKEDLIST_TEMPLATE_NODE_ITERATOR_H


#include <iterator>
//#include "Node.h"
template <class T>
class Node {
public:
    T data;
    Node<T>* next;
    Node<T>* prev;

};
template <class T>
class Node_iterator:public std::iterator<std::forward_iterator_tag,T> {
private:
    Node<T>* current;
public:
    T&operator*();
    Node_iterator operator++(int);
    Node_iterator& operator ++();
    Node_iterator operator --(int);
    Node_iterator& operator --();
    Node_iterator();
    Node_iterator(Node<T>* n);
    bool operator !=(const Node_iterator& n) const;
    bool operator == (const Node_iterator& n) const;

};



#include "Node_iterator.cpp"
#endif //LINKEDLIST_TEMPLATE_NODE_ITERATOR_H

