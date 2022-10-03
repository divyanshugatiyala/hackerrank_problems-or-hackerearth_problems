public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum=0;
        int n=A.length;
        int i=0, j=A.length-1;

        while(i<n && j>=0)
        sum += A[i++][j--];
        return sum;
    }
}
