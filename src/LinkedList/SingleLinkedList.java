package LinkedList;

public class SingleLinkedList {

    private Node head;

    public SingleLinkedList insertAtLast(SingleLinkedList list, int data){

        Node newNode = new Node(data);

        if(list.head == null)
        {
            list.head = newNode;
            return list;
        }

        Node last = list.head;

        while(last.getNext() != null)
        {
            last = last.getNext();
        }

        last.setNext(newNode);

        return list;
    }

    public SingleLinkedList insertAtStart(SingleLinkedList list, int data){
        Node newNode = new Node(data);
        Node old = list.head;
        list.head = newNode;
        newNode.setNext(old);
        return list;
    }

    public SingleLinkedList insertInTheMiddle(SingleLinkedList list, int data, int index) {
        if (list == null)
        {
            System.out.println("List is null.");
            return null; // Return null or handle this error accordingly.
        }

        Node newNode = new Node(data);
        if (index == 0)
        { // Handle inserting at the start
            newNode.setNext(list.head);
            list.head = newNode;
            return list;
        }

        Node pointer = list.head;
        int count = 1;

        while (pointer != null && count < index)
        {
            pointer = pointer.getNext();
            count++;
        }

        if (pointer == null)
        {
            System.out.println("Index out of bounds. Index -> " + index);
            return list; // Return the original list without changes or handle this error accordingly.
        }

        newNode.setNext(pointer.getNext());
        pointer.setNext(newNode);

        return list;
    }

    /**
     * Delete Operations
     * @param
     */
    public SingleLinkedList deleteByElement(SingleLinkedList list, int element){
        if(list == null)
        {
            System.out.println("SingleLinkedList is Not Found");
            return null;
        }

        if(head.getData() == element)
        {
            head = head.getNext();
            return list;
        }

        Node pointer = head;

        while(pointer != null && pointer.getNext().getData() != element)
        {
            pointer = pointer.getNext();
        }

        pointer.setNext(pointer.getNext().getNext());

        return list;
    }

    public static void traverse(SingleLinkedList list){
        Node currentNode = list.head;

        System.out.println("SingleLinkedList: ");

        while(currentNode != null)
        {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }

    public static boolean elementFoundInList(SingleLinkedList list, int element){
        if(list == null)
        {
            System.out.println("SingleLinkedList is Not Found");
            return false;
        }

        Node pointer = list.head;

        while(pointer != null)
        {
            if(pointer.getData() == element) return true;
            pointer = pointer.getNext();
        }

        return false;
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.insertAtLast(list, 1);
        list.insertAtLast(list, 2);
        list.insertAtLast(list, 3);
        list.insertAtLast(list, 4);
        list.insertAtLast(list, 5);
        list.insertAtLast(list, 6);
        list.insertInTheMiddle(list, 46, 3);
        list.insertAtStart(list, 7);
        traverse(list);
        System.out.println("");
        list.deleteByElement(list, 6);
        traverse(list);
        System.out.println("");
        System.out.println("" + elementFoundInList(list, 1));
        System.out.println("" + elementFoundInList(list, 100));
    }
}
