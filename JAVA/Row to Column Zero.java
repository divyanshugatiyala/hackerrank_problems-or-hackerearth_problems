public class Solution {
    public int[][] solve(int[][] A) {

        int n=A.length, m=A[0].length;
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++)        
            for(int j=0; j<m; j++)            
                ans[i][j]=A[i][j];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                
                if(A[i][j]==0){
                    
                    for(int k=0; k<n; k++ ) ans[k][j]=0;
                    for(int k=0; k<m; k++ ) ans[i][k]=0;

                }
            }
        }
        return ans;
    }
}
