public class SearchInRotated {
    public static void main(String[] args) {
        int []arr = new int[]{4,5,6,7,0,1,2};

        int index = search(arr, 0);

        System.out.println(index);
    }
    public static int search(int []arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (high - low)/2+1;

            if(arr[mid] == target) return mid;
            
            //left half sorted
            if(arr[mid]<=arr[mid]){

                if(target>=arr[low] && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
