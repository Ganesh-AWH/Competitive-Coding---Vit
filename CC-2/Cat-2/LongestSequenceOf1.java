import java.util.Scanner;

public class LongestSequenceOf1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = findLongestSequenceOf1(arr, n);
        System.out.println(res);
        sc.close();
    }
    public static int findLongestSequenceOf1(int []arr, int n){
        int max = -1;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                max = Integer.max(max, count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}