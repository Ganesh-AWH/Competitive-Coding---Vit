public class BinarySearch {
    public static void main(String[] args) {
        int []arr = new int[]{1, 5, 8, 10, 12, 40, 55, 100};
        int index = binarySearchIterative(arr, 101); // logn 
        System.out.println(index);
    }
    public static int binarySearchIterative(int []arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (high - low)/2+low;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
