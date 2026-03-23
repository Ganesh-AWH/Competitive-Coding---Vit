import java.util.*;
public class StrobogrammaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        boolean res = isStrobogrammatic(number);
        System.out.println(res);
        sc.close();
    }
    public static boolean isStrobogrammatic(String number){
        Map<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');

        int l = 0;
        int r = number.length()-1;

        while(l<=r){
            char lChar = number.charAt(l);
            char rChar = number.charAt(r);

            if(!map.containsKey(lChar) || map.get(lChar) != rChar) return false;

            l++;
            r--;
        }
        return true;
    
    }
}
