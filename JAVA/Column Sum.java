public class Solution {
    public int[] solve(int[][] A) {
        int[] ans = new int[A[0].length];

        for(int j=0; j<A[0].length;  j++){
            for(int i=0; i<A.length; i++)
            ans[j]+=A[i][j];
        }
        return ans;
    }
}
