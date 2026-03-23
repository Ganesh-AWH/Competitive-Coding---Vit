import java.util.Scanner;

public class PowerofFour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPowerOfFourApproach2(n);
        System.out.println(res);
        sc.close();
    }
    public static boolean isPowerOfFourApproach1(int n){
        if(n<=0) return false;

        while(n%4 == 0){
            n/=4;
        }
        return n==1;
    }
    public static boolean isPowerOfFourApproach2(int n){
        return n>0 && (n & (n-1)) == 0 && (n & 0x55555555) != 0;

        // (n & (n-1)) -> this is condition of power of 2
        // (n & 0x55555555) -> checking all even position have 1 


        //why 0x55555555 -> 01010101010101010101010101010101  only even position are 1

        // example - 1 (n=16)
        // n =        10000
        // mask =  01010101
        // ----------------
        // result =   10000  ✅ not zero

        // example - 2 (n=8)
        // n =        01000
        // mask = 01010101
        // ----------------
        // result =   00000  ❌ zero
    
    }

}