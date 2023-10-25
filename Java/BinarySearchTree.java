import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {
    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        root = insertRecursively(root, value);
    }

    private Node insertRecursively(Node current, int value){
        if(current == null)return new Node(value);

        if(value < current.value){
            current.left = insertRecursively(current.left, value);
        }else if(value > current.value){
            current.right = insertRecursively(current.right, value);
        }
        return current;
    }

    private boolean searchRecursicely(Node current, int value){
        if(current == null) {
            return false;
        }
        if(current.value > value){
            searchRecursicely(current.left, value);
        }else if(current.value < value){
            searchRecursicely(current.right, value);
        }
        return true;
    }

    public int findMin(){
        if(root == null) return 0;
        return findMinRecuresilvey(root);
    }

    private int findMinRecuresilvey(Node root){
        return root.left == null ? root.value : findMinRecuresilvey(root.left);
    }

    public static void main(String[] args) {
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(50);
//        bst.insert(30);
//        bst.insert(70);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(60);
//        bst.insert(80);
//        bst.insert(5);
//
//        System.out.println("Minimum value in the BST: " + bst.findMin()); // Output: 20
//        System.out.println("Is exist?" + bst.searchRecursicely(bst, 20)); // Output: 20

//        List<Integer> array = new ArrayList<>(Arrays.asList(1, 3, 2, 6, -1, 4, 1, 8, 2));
//        int k = 5;

//        int nums[] = {1,12,-5,-6,50,3};
//        int k = 4;
//
//        double average = findMaxAverage(nums, k);
//
//        System.out.println(average);

        String s = "aababcabc";

        int count = countGoodSubstrings(s);

        System.out.println(count);

    }

    public static int countGoodSubstrings(String s) {

        boolean unique = true;

        int count = 0;

        for(int j = 0; j < s.length() - 3; j++)
        {
            count = isUnique(s.substring(j, j + 3), unique) ? ++count : count;
            unique = true;
        }

        return count;
    }

    //XYZ
    private static boolean isUnique(String s, boolean unique){
        for(int i = 0; i < 3 - 1; i++)
        {
            String newStr = s.substring(0, i) + s.substring(i + 1, 3);

            if(newStr.contains(String.valueOf(s.charAt(i))))
            {
                unique = false;
                break;
            }
            newStr = "";
        }
        return unique;
    }


    public static double findMaxAverage(int[] nums, int k) {

        int firstSum = 0, highSum = 0;

        for(int i = 0; i < k; i++)
        {
            firstSum+=nums[i];
        }

        highSum = firstSum;

        for(int j = 0; j < nums.length - k; j++)
        {
            firstSum = firstSum - nums[j] + nums[j + k];
            highSum = highSum > firstSum ? highSum : firstSum;
        }

        double response = highSum/k;

        return response;
    }
}
