public class Solution {
    public int[] solve(int[][] A) {
        int[] ans= new int[A.length];

        for(int i=0; i<A.length; i++){
            for(int ele : A[i])
            ans[i]+=ele;
        }
        return ans;
    }
}
