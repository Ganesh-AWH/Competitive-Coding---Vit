public class HourGlass {
    public static void printHourGlass(int [][]arr){
        int m = arr.length;
        int n = arr[0].length;
        if(m < 3 || n<3){
            System.out.println("Invalid array, Hour glass is not possible");
            return;
        }

        for(int i=1; i<=m-2; i++){
            for(int j=1; j<=n-2; j++){
                System.out.println(arr[i-1][j-1]+" "+ arr[i-1][j]+" "+ arr[i-1][j+1]);
                System.out.println("  "+ arr[i][j]);
                System.out.println(arr[i+1][j-1]+" "+ arr[i+1][j]+ " " + arr[i+1][j+1]);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int [][]arr = new int[][]{{1,2,3},{4,5,6}, {7,8,9}};
        printHourGlass(arr);
    }
}
