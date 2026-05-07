public class PeakElement {
    public static void main(String[] args) {
        // int []arr = new int[]{1,2,3,1};
        int []arr = new int[]{1, 2, 1, 3, 5, 6, 4};

        int index = findPeakElement(arr);
        System.out.println(index);
    }
    public static int findPeakElement(int []arr){
        int low = 0;
        int high = arr.length-1;

        int ans = -1;

        while(low<=high){
            int mid = (high - low)/2 + low;

            if(mid+1 < arr.length && arr[mid] < arr[mid+1]){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}
