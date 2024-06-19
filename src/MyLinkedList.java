package src;

import entity.Node;

public class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirstNode(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            head.link = newNode;
            head = newNode;
        }
        size++;
    }
}
