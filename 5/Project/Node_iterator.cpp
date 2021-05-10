
#ifndef LINKEDLIST_TEMPLATE_NODE_ITERATOR_CPP
#define LINKEDLIST_TEMPLATE_NODE_ITERATOR_CPP

#include "Node_iterator.h"
template <class T>
T& Node_iterator<T>::operator*() {
    return current->data;
}
template <class T>
Node_iterator<T> Node_iterator<T>::operator++(int) {
    Node<T>* temp = current;
    current = current->next;
    return *this;
}
template <class T>
Node_iterator<T>::Node_iterator() {
    current = nullptr;
}
template <class T>
Node_iterator<T>::Node_iterator(Node<T> *n) {
    current = n;
}
template <class T>
Node_iterator<T> Node_iterator<T>::operator--(int) {
    Node<T>* temp = current;
    current = current->prev;
    return *this;
}
template <class T>
bool Node_iterator<T>::operator!=(const Node_iterator<T>&n) const{
    return current != n.current;
}
template <class T>
Node_iterator<T>& Node_iterator<T>::operator++() {
    current = current->next;
    return *this;
}
template <class T>
Node_iterator<T>& Node_iterator<T>::operator--() {
    current = current ->prev;
    return *this;
}
template <class T>
bool Node_iterator<T>::operator==(const Node_iterator<T>& n) const {
    return current == n.current;
}
#endif
