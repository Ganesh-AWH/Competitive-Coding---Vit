import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPowerofTwo(n);
        System.out.println(res);
        sc.close();
    }
    public static boolean isPowerofTwo(int n){
        return n>0 && (n & (n-1)) == 0; 
    }
}
