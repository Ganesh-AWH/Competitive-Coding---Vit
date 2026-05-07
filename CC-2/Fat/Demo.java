import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Quick Sort
        int []arr = new int[]{5, 3, 10, 13, 1, 6};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergeSort(int []arr, int low, int high){
        if(low>=high) return;

        int mid = (high-low)/2 + low;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int []arr, int low, int mid, int high){
        int size = high - low + 1;
        int []temp = new int[size];
        int i = low;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid) temp[k++] = arr[i++];
        while(j<=mid) temp[k++] = arr[j++];
        

        for(int x = low; x<=high; x++){
            arr[x] = temp[x-low];
        }
    }
    
}
