package LinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node tail;

    public DoubleLinkedList insertAtBeginning(DoubleLinkedList list, int data){
        Node newNode = new Node(data);

        newNode.setNext(list.head);

        if(list.head != null)
        {
            list.head.setPrevious(newNode);
        }else
        {
            list.tail = newNode;
        }

        list.head = newNode;

        return list;
    }

    public DoubleLinkedList insertAtEnding(DoubleLinkedList list, int data){
        Node newNode = new Node(data);

        newNode.setPrevious(list.tail);

        if(list.tail != null)
        {
            list.tail.setNext(newNode);
        }else
        {
            list.head = newNode;
        }

        list.tail = newNode;

        return list;
    }

    public DoubleLinkedList insertAtPosition(DoubleLinkedList list, int data, int index){

        if(list.head == null || index == 0)
        {
            insertAtBeginning(list, data);
            return list;
        }

        Node newNode = new Node(data);
        Node current = list.head;
        int currentPosition = 0;

        while(current != null && currentPosition < index - 1)
        {
            current = current.getNext();
            currentPosition++;
        }

        if(current == null)
        {
            insertAtEnding(list, data);
            return list;
        }

        newNode.setPrevious(current);
        newNode.setNext(current.getNext());

        if(current.getNext() != null)
            current.getNext().setPrevious(newNode);
        else
            list.tail = newNode;
        current.setNext(newNode);
        return list;
    }

    public DoubleLinkedList deleteElementByValue (DoubleLinkedList list, int element)
    {
        if(list == null || list.head == null)
        {
            System.out.println("List is empty.");
            return list;
        }

        if(list.head.getData() == element)
        {
           list.head = list.head.getNext();

           if(list.head != null)
           {
               list.head.setPrevious(null);
           }else
           {
               list.tail = null;
           }
           return list;
        }

        Node current = list.head;

        while(current != null && current.getData() != element)
        {
            current = current.getNext();
        }

        if(current == null)
        {
            System.out.println("Element not found in the lise");
            return list;
        }

        if(current.getPrevious() != null)
        {
            current.getPrevious().setNext(current.getNext());
        }

        if(current.getNext() != null)
        {
            current.getNext().setPrevious(current.getPrevious());
        }else
        {
            list.tail = current.getPrevious();
        }

        return list;
    }

    public static void traverseForward(DoubleLinkedList list){
        Node currentNode = list.head;

        System.out.print("DoubleLinkedList: ");

        while(currentNode != null)
        {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.insertAtBeginning(list, 1);
        list.insertAtBeginning(list, 2);
        list.insertAtBeginning(list, 3);
        list.insertAtBeginning(list, 4);
        list.insertAtBeginning(list, 5);
        list.insertAtEnding(list, 45);
        list.insertAtBeginning(list, 6);
        list.insertAtEnding(list, 40);
        traverseForward(list);
        System.out.println();
        list.insertAtPosition(list, 30, 3);
        traverseForward(list);
        System.out.println();
        list.deleteElementByValue (list, 4);
        traverseForward(list);
        System.out.println();
    }
}
