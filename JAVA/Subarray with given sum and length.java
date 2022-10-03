public class Solution {
    public int solve(int[] A, int B, int C) {

        int sum=0;
        for(int i=0; i<A.length; i++)
        {
            sum+=A[i];
            if(i>=B-1)
            {
                if(sum==C) return 1;
                sum-=A[i-(B-1)];
            }
        }
        return 0;
    }
}
