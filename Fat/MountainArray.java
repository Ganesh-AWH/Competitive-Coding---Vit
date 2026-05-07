public class MountainArray {
    public static void main(String[] args) {
        // int []arr = new int[]{0,1,2,4,2,1};
        int []arr = new int[]{1, 2, 3, 4, 5, 3, 1};
        int len = arr.length;
        int target = 3;
        System.out.println(findMountainArray(arr, target, len));
    }
    public static int findMountainArray(int []arr, int target, int len){
        int peak = findPeakElement(arr, len);
    
        int minIndex = ascendingBs(arr, 0, peak, target);
        if(minIndex != -1) return minIndex;
    
        minIndex = descendingBs(arr, peak+1, len-1, target);
        return minIndex;
    }
    public static int findPeakElement(int []arr,int len){
        int low = 0;
        int high = len-1;

        int ans = -1;

        while(low<=high){
            int mid = (high - low)/2 + low;
            if(mid+1<len && arr[mid] < arr[mid+1]){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }

    public static int ascendingBs(int []arr, int s, int e, int target){
        
        while(s<=e){
            int mid = (e-s)/2 + s;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public static int descendingBs(int []arr, int s, int e, int target){
        
        while(s<=e){
            int mid = (e-s)/2 + s;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}
