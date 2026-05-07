public class SearchIn2D {
    public static void main(String[] args) {
        int [][]arr = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        boolean isPresent = search(arr, 100);
        System.out.println(isPresent);

    }
    public static boolean search(int [][]arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        
        int low = 0;
        int high = m*n-1;
    
        while(low<=high){
            int mid = (high - low)/2 + low;
    
            int r = mid/n; 
            int c = mid%n;
    
            if(arr[r][c] == target) return true;

            else if(arr[r][c] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;

    }
}
