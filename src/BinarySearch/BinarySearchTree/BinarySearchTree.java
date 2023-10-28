package BinarySearch.BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null)
        {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true)
        {
            parent = current;
            if(root.getData() > data)
            {
                current = current.getLeft();
                if(current == null)
                {
                    parent.setLeft(newNode);
                    return;
                }
            } else if(root.getData() < data)
            {
                current = current.getRight();
                if(current == null)
                {
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }

    public void inorderTraverse(){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while(current != null && !stack.isEmpty())
        {
            while (current != null)
            {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();

            System.out.println(current.getData() + " ");
            current = current.getRight();
        }
    }
}