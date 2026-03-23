public class SpiralMatrix {
    public static void printSpiralMatrix(int [][]arr){
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        
        //Creating boundaries
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        int total = m * n;
        while(count < total){
            //left to right
            for(int i=left; i<=right && count < total; i++){
                System.out.print(arr[top][i]+" ");
                count++;
            }
            top++;
            //top to bottom
            for(int i=top; i<=bottom && count < total; i++){
                System.out.print(arr[i][right]+" ");
                count++;
            }
            right--;

            //right to left
            for(int i=right; i>=left && count < total; i--){
                System.out.print(arr[bottom][i]+" ");
                count++;
            }
            bottom--;

            //bottom to top
            for(int i=bottom; i>=top && count < total; i--){
                System.out.print(arr[i][left]+" ");
                count++;
            }
            left++;
        }
    }
    public static void main(String[] args) {
        int [][]arr = new int[][]{{1,2,3},{4,5,6}, {7,8,9}};
        printSpiralMatrix(arr);
    }    
}
