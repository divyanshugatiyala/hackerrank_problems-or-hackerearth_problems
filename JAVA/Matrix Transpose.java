public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
       int m = A[0].length;

       int [][] t= new int[m][n];

       for(int j=0; j<m; j++){
           for(int i=0; i<n; i++)
           t[j][i] = A[i][j];
       } 
       return t;
    }
}

