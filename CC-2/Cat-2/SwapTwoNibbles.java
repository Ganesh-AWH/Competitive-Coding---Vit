import java.util.Scanner;

public class SwapTwoNibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = swapNibbles(n);
        System.out.println(res);
        sc.close();
    }
    public static int swapNibbles(int n){
        int low = (n & 0x0F) << 4;
        int high = (n & 0xF0) >> 4;

        return low | high;
    }
}
