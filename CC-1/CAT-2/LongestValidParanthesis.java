import java.util.Scanner;
import java.util.Stack;

public class LongestValidParanthesis {
    public static int findLongest(String s){
        char []arr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(c == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max = Integer.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = findLongest(str);
        System.out.println(length);
        sc.close();
    }
}
