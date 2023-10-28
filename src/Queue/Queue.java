package Queue;

public class Queue {

    private Node head, tail;

    public void enqueue(int data){
        Node newNode = new Node(data);

        if(tail == null)
        {
            head = tail = newNode;
        } else
        {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int dequeue(){

        if(head == null)
        {
            throw new IllegalStateException("Queue is Empty");
        }

        int data = head.getData();

        head = head.getNext();

        if(head == null)
        {
            tail = null;
        }
        return data;
    }

    public void traverse(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(" " + temp.getData());
            temp = temp.getNext();
        }
    }



    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.traverse();
        System.out.println(" ");
        System.out.println("Remove From the Queue " + queue.dequeue());
        queue.traverse();
    }
}