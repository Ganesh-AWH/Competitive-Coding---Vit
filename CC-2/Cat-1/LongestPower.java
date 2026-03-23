public class LongestPower{
    public static void main(String[] args) {
        int n = 10;
        int p = 2;
        int count = 0;
        while(n>0){
            n/=p;

            count += n;
        }
        System.out.println(count);
    }
}