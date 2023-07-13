package org.GBLinkedList;

public interface GBLinkedList<T> {
    int length();
    void addHead(T o);
    void addTail(T o);
    T getValue(int index);
}