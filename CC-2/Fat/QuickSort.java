import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = new int[]{5, 3, 10, 13, 1, 6};
        
        qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void qSort(int []arr, int s, int e){
        if(s>=e) return;

        int pivotIndex = findPivotIndex(arr, s, e);
        qSort(arr, s, pivotIndex-1);
        qSort(arr, pivotIndex+1, e);
    }
    public static int findPivotIndex(int []arr, int s, int e){
        int pivot = s;

        while(s<=e){
            while(s<=e && arr[s]<=arr[pivot]) s++;
            while(e>=s && arr[e] > arr[pivot]) e--;

            if(s<e){
                swap(arr, s, e);
            }
        }
        swap(arr, e, pivot);
        return e;
    }
    public static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

}
