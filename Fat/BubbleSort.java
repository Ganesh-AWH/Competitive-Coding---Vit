import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = new int[]{5, 3, 10, 13, 1, 6};

        bubbleSortAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSortAlgorithm(int []arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
