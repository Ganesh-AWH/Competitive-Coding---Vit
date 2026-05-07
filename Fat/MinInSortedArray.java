public class MinInSortedArray {
    public static void main(String[] args) {
        int []arr = new int[]{4, 5, 6, 7, 0, 1, 2};

        int index = search(arr, 0);
        System.out.println(index);
    }
    public static int search(int []arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            
            // sorted return low
            if(arr[low]<=arr[high]){
                ans = Integer.min(ans, arr[low]);
                return ans;
            }

            int mid = (high - low)/2 + low;

            if(arr[low] <= arr[mid]){
                ans = Integer.min(ans, arr[low]);
                low = mid+1;
            }else{
                ans = Integer.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
