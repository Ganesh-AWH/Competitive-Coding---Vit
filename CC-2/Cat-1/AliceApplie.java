import java.util.Scanner;

public class AliceApplie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reqApple = sc.nextInt();
        int res = findPerimeter(reqApple);
        System.out.println(res);
        sc.close();
    }
    public static int findPerimeter(int reqApple){
        int sum = 0;
        int layer = 0;
        while(reqApple > sum){
            layer++;
            sum += (12 * layer * layer);
        }

        return 8 * layer;
    }
}



