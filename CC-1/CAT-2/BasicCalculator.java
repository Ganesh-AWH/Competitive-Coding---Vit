import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = calculate(str);
        System.out.println(ans);
    }
    public static int calculate(String str){
        Stack<Integer> stack = new Stack<>();

        char []arr = str.toCharArray();
        int number = 0;
        int sign = 1;
        int result = 0;
        for(char c:arr){
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }else if(c == '+'){
                result += sign * number;
                number = 0; 
                sign = 1;
            }else if(c == '-'){
                result += sign * number;
                number = 0;
                sign = -1;
            }else if(c == '('){
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }else if(c == ')'){
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        if(number != 0) result += sign * number;
        return result;
    }
}
