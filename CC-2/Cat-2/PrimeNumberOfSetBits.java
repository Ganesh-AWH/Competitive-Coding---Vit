import java.util.Scanner;

public class PrimeNumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int res = countPrimeNumberOfSetBits(l, r);
        System.out.println(res);

        sc.close();
    }
    public static int countPrimeNumberOfSetBits(int l, int r){
        int count = 0;

        for(int i=l; i<=r; i++){
            int bits = Integer.bitCount(i);
            if(isPrime(bits)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        if(num<2) return false;

        int sqrt = (int)Math.sqrt(num);
        for(int i=2; i<=sqrt; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}
