package org.GBLinkedList;
public class Node<T> {
    private T value;
    private Node<T> prev;
    private Node<T> next;
    public Node(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    public Node(T value, Node<T> prev, Node<T> next){
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
    public T getValue() {
        return value;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
    public Node<T> getNext() {
        return next;
    }
    public Node<T> getPrev() {
        return prev;
    }
}
