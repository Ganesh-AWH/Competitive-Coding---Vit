import java.util.*;
public class ValidParanthesis {
    public static boolean isValid(String s){
        char []arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c:arr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;

                else if(c == ')' && stack.peek()!='(') return false;
                else if(c == '}' && stack.peek()!='{') return false;
                else if(c == ']' && stack.peek()!='[') return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println(string);
        boolean res = isValid(string);
        System.out.println(res);
        sc.close();
    }
}
