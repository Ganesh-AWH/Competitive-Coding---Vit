import java.util.Scanner;

public class MaximumEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        
        int res = findMaxEquilibriumIndex(arr, n);
        System.out.println(res);
        sc.close();
    }
    public static int findMaxEquilibriumIndex(int []arr, int n){
        int rightSum = 0;
        for(int i=0; i<arr.length; i++) rightSum += arr[i];

        int leftSum = 0;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            rightSum -= arr[i];

            if(leftSum == rightSum){
                if(max < leftSum){
                    max = leftSum;
                    index = i;
                }
            }

            leftSum += arr[i];
        }

        return index;
    }
}
