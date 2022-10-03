public class Solution {
    public int solve(int A, int B, int C) {

        int[] ans = {A,B,C};
        Arrays.sort(ans);
        return ans[0]*10000+ans[1]*100+ans[2];
    }
}
