public class Solution {
    public int[][] diagonal(int[][] A) {

        int n= A.length;
        int[][] ans= new int[2*n-1][n];
        for(int i=0; i<2*n-1; i++){

            int x, y;
            if(i<n)
            {
                x=0; y=i;
                int k=0;
                while(x<n && y>=0)
               ans[i][k++] = A[x++][y--]; 
            }
            else 
            {
                x=i-n+1; y=n-1;

                int k=0;
               while(x<n && y>=0)
               ans[i][k++] = A[x++][y--]; 
            }

            
        }

        return ans;
    }
}
