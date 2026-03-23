//find the maximum product of subarray
public class MaximumProduct {
    public static void main(String[] args) {
        //two pointers approach
        int []arr = new int[]{0};
        int maximum1 = solution2(arr);
        int maximum2 = solution3(arr);
        System.out.println(maximum1);
        System.out.println(maximum2);

    }
    public static int Solution1(int []arr){
        int product = 1;
        int maxi = Integer.MIN_VALUE;
        //forward
        for(int i=0; i<arr.length; i++){
            if(product == 0){
                product = 1;
            }
            product = product * arr[i];
            maxi = Integer.max(maxi, product);
        }

        //reverse
        product = 1;
        for(int i=arr.length-1; i>=0; i--){
            if(product == 0){
                product = 1;
            }
            product = product * arr[i];
            maxi = Integer.max(maxi, product);
        }
        return maxi;
    }
    public static int solution2(int []arr){
        int maxi = Integer.MIN_VALUE;
        int left = 1;
        int right = 1;
        int i = 0;
        int j = arr.length-1;
        while(i<arr.length){
            if(left == 0) left = 1;
            if(right == 0) right = 1;

            left = left * arr[i++];
            right = right * arr[j--];
            maxi = Integer.max(maxi, Integer.max(left, right));
        }
        return maxi;
    }
    public static int solution3(int []arr){
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int product = 1;
            for(int j=i; j<n; j++){
                product = product * arr[j];
                maxi = Integer.max(product, maxi);
            }
        }

        return maxi;
    }
}
