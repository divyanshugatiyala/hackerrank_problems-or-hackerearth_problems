public class Solution {
    public void solve(int[][] A) {
        int n = A.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp= A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){

            int x=0, y=n-1;
            while(x<y)
            {
                int temp = A[i][x];
                A[i][x]=A[i][y];
                A[i][y]=temp;
                x++; y--;
            }
        }
       
    }
}
