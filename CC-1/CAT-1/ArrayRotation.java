import java.util.Arrays;
public class ArrayRotation {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5};
        int rotations = 3;
        leftRotate(arr, rotations);
        rightRotate(arr, rotations);
        System.out.println(Arrays.toString(arr));
    }   
    public static void rightRotate(int []arr, int rotations){
        int len = arr.length;
        rotations = rotations%len;
        if(rotations == 0) return;
 
        reverse(arr, 0, len-1);
        reverse(arr, 0, len- rotations -1);
        reverse(arr, len-rotations, len-1);
    }
    public static void reverse(int []arr, int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void leftRotate(int []arr, int rotations){
        int len = arr.length;
        rotations = rotations % len;
    
        if(rotations == 0) return;
        
        //full reverse
        reverse(arr, 0, len-1);
        reverse(arr, 0, rotations);
        reverse(arr, rotations, len-1);
    }
}
