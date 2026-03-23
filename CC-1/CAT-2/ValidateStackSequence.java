import java.util.Scanner;
import java.util.Stack;

public class ValidateStackSequence {
    public static boolean validate(int []pushed, int[]popped){
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i=0; i<pushed.length; i++){
            stack.push(pushed[i]);

            while(!stack.isEmpty() && j<popped.length && stack.peek() == popped[j]){
                j++;
                stack.pop();
            }
        }
        return j == popped.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int []pushed = new int[n1];
        for(int i=0; i<n1; i++){
            int ele = sc.nextInt();
            pushed[i] = ele;
        }
        
        int n2 = sc.nextInt();
        int []popped = new int[n2];
        for(int i=0; i<n2; i++){
            int ele = sc.nextInt();
            popped[i] = ele;
        }

        boolean ans = validate(pushed, popped);
        System.out.println(ans);
    }
}
