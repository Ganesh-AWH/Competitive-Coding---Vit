public class ChineseRemainder {
    public static void main(String[] args) {
        int []a = new int[]{1,2,3};
        int []m = new int[]{3,4,5};

        int res = chineseAlgo(a, m);

        System.out.println(res);
    }
    public static int chineseAlgo(int []a, int []m){
        int M = 1;

        for(int i=0; i<m.length; i++){
            M *= m[i];
        }
        
        int res = 0;
        for(int i=0; i<m.length; i++){
            int Mi = M/m[i];
            int yi = modInverse(Mi, m[i]);
            res += Mi * yi * a[i];
        }

        return res%M;
    }
    public static int modInverse(int a, int m){
        a = a%m;
        for(int x=1; x<m; x++){
            if((a*x)%m == 1) return x;
        }

        return -1;
    }
}



