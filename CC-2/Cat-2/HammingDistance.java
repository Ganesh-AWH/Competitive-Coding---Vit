import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int res = findHammingDistance(x, y);
        System.out.println(res);
        sc.close();
    }
    public static int findHammingDistance(int x, int y){
        int count = 0;
        //xor operation on x and y
        int xor = x ^ y;

        //find no of set bits in xor variable
        while(xor>0){
            count = count + (xor&1);
            xor = xor>>1;
        }
        return count;
    }
}
