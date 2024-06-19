package entity;

public class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return data;
    }
}
