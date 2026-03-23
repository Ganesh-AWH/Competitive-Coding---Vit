import java.util.Scanner;

public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean res = isGoodArray(arr);
        System.out.println(res);
        sc.close();
    }
    public static boolean isGoodArray(int []arr){
        //if gcd all all elements == 1 then the array is good array
        int gcd = arr[0];

        for(int i=1; i<arr.length; i++){
            gcd = findGcd(gcd, arr[i]);
        }
        return gcd == 1;
    }
    public static int findGcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
