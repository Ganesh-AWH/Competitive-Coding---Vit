import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countSetBits(n);
        System.out.println(count);
        sc.close();
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            count = count + (n&1);
            n = n>>1;
        }
        return count;
    }
}
