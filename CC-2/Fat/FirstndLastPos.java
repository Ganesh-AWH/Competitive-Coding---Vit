import java.util.Arrays;

public class FirstndLastPos {
    public static void main(String[] args) {
        int []arr = new int[]{5, 7, 7, 8, 8, 10};
        int target = 7;

        int []ans = firstndLastPos(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] firstndLastPos(int []arr, int target){

        int lower = lowerBound(arr, target);
        
        if(lower == arr.length || arr[lower] != target) return new int[]{-1, -1};

        int upper = upperBound(arr, target);

        return new int[]{lower, upper-1};
    }
    public static int lowerBound(int []arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;

        while(s<=e){
            int mid = (e-s)/2 + s;

            if(arr[mid] >= target){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int []arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;

        while(s<=e){
            int mid = (e - s)/2 + s;
            if(arr[mid] > target){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    
}
