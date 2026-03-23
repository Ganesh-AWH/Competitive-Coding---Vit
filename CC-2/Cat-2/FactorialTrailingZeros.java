import java.util.Scanner;

public class FactorialTrailingZeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = factorialTrailingZeros(n);
        System.out.println(count);
        sc.close();
    }
    public static int factorialTrailingZeros(int n){
        int count = 0;
        while(n>0){
            count += n/5;
            n = n/5;
        }
        return count;
    }
}