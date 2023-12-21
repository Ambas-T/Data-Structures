
public class SelectionSort {

    public int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] < arr[minIndex]){
                    minIndex = i;
                }
                swap(arr, i, minIndex);
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}