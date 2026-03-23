import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class RPN {
    public static int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        Stack<Integer> stack = new Stack<>();
        for(String str:tokens){
            if(!set.contains(str)){
                int num = Integer.parseInt(str);
                stack.push(num);
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(str.equals("+")){
                    stack.push(num1+num2);
                }
                else if(str.equals("-")){
                    stack.push(num1-num2);
                }else if(str.equals("*")){
                    stack.push(num1*num2);
                }else{
                    stack.push(num1/num2);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        int res = evalRPN(arr);
        System.out.println(res);
        sc.close();
    }
}

// 5
// 2 3 + 3 *