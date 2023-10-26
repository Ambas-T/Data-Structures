package Stack;

public class Stack {

    private Node head;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public int pop(){
        if(isEmpty())
        {
            throw new IllegalStateException("Stack is Empty");
        }

        int data = head.getData();
        head = head.getNext();

        return data;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void traverse(){
        Node temp = head;
        while(temp != null)
        {
            System.out.println(" " + temp.getData());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.traverse();

        System.out.println("\nPopped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
