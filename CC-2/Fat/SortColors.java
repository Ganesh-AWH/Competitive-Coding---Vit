import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int []arr = new int[]{2, 0, 2, 1, 1, 0};

        sort(arr); 
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        int zi = 0;
        int ti = arr.length-1;
    
        int i = 0;
    
        while(i<=ti){
            if(arr[i] == 0){
                swap(arr, i, zi);
                zi++;
                i++;
            }else if(arr[i] == 2){
                swap(arr, i, ti);
                ti--;
            }else{
                i++;
            }
        }
    }
    public static void swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
