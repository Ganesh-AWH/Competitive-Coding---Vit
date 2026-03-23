import java.util.Scanner;

public class GCDArray {
    public static int Bruteforce(int a, int b){
        int gcd = 0;
        for(int i=1; i<=Integer.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int Optimal(int a, int b){
        //gcd(a,b) = gcd(a%b, b)
        // a = a%b
        // b = b;
        while(b!=0){
            int res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        res = arr[0];
        for(int i=1; i<n; i++){
            res = Optimal(res, arr[i]);
        }
        System.out.println(res);
        sc.close();
    }
}

