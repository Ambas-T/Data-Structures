
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        int len = arr.length;

        for(int i = 0; i < len - 1; i++)
        {
            for(int j = 0; j < len - 1; j++)
            {
                if(arr[i] > arr[j + 1])
                {
                    swap(arr, i, j + 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}