import java.util.Scanner;

public class SumOfSqNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        boolean ans = isPossible(c);
        System.out.println(ans);
        sc.close();
    }
    //two pointer approach
    public static boolean isPossible(int c){
        int low = 0;
        int high = (int)Math.sqrt(c);

        while(low<=high){ 
            long sum = (long)low*low + (long)high*high;

            if(sum == c) return true;

            else if(sum < c){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
}
