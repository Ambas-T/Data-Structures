package Stack;

import java.util.HashMap;

public class Node {


    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node topNode) {
        this.next = topNode;
    }
}
