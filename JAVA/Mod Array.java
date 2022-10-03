public class Solution {
    public int solve(int[] A, int B) {

        long ans=0;
        long power = 1;

        int n=A.length;

        for(int i=n-1; i>=0; i--) {
            ans = (ans%B + ((A[i]%B)*(power%B))%B)%B;
            power = ( (power%B) * (10%B) )%B;
        }

        return (int)ans;
    }
}
