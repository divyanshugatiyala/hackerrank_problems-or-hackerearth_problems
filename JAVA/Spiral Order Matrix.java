public class Solution {
    public int[][] generateMatrix(int A) {

        int sq=1;

        int[][] arr= new int[A][A];
        int row=0, col=0;
        while(A>1){

            for(int k=1; k<A; k++){
                arr[row][col++] = sq++;
            }

            for(int k=1; k<A; k++){
                arr[row++][col]=sq++;
            }

            for(int k=1; k<A; k++){
                arr[row][col--]=sq++;
            }

            for(int k=1; k<A; k++){
                arr[row--][col]=sq++;
            }

            A=A-2;
            row++;
            col++;
        }

        if(A==1) arr[row][col] = sq++;
        return arr;
    }
}
