import java.util.Scanner;

public class BinaryPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPalindrome(n);
        System.out.println(res);
        sc.close();
    }
    public static boolean isPalindrome(int n){
        int rev = 0;
        int original = n;
        while(n>0){
            int lastBit = n & 1;
            rev = (rev<<1) | lastBit;
            n = n>>1;
        }

        return rev == original;
    }
}