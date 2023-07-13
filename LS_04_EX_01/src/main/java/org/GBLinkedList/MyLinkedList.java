package org.GBLinkedList;

public class MyLinkedList<T> implements GBLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    public MyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    @Override
    public int length() {
        return size;
    }
    @Override
    public void addHead(T o) {
        if (size == 0) {
            head = new Node<T>(o);
            tail = head;
        }
        else {
            Node<T> node = head;
            head = new Node<T>(o, null, node);
            node.setPrev(head);
        }
        size ++;
    }
    @Override
    public void addTail(T o) {
        if (size == 0) {
            head = new Node<T>(o);
            tail = head;
        }
        else {
            Node<T> node = tail;
            tail = new Node<T>(o, node, null);
            node.setNext(tail);
        }
        size ++;
    }
    @Override
    public T getValue(int index) {
        if (index > size - 1 && index < 0) return null;
        if (index == 0) return head.getValue();
        if (index == size-1) return tail.getValue();
        Node<T> item = head.getNext();
        int i = 1;
        while (i < index){
           item = item.getNext();
           i++;
        }
        return item.getValue();
    }

    @Override
    public String toString() {
        Node<T> node = head;
        StringBuilder result = new StringBuilder("[");
        while (node != null) {
            result.append(node.getValue()).append(",");
            node = node.getNext();
        }
        if (result.length() > 1)
            result.deleteCharAt(result.length() - 1);
        result.append("]");
        return result.toString();
    }
}
