public class Solution {
    public int fastPOwer(long a, int b, int m) {
        long ans=1;

        while(b>0) {
            if( (b&1) ==1) ans= (ans*a)%m;
            b >>=1;
            a = (a*a)%m;
        }
        return (int)ans%m;
    }
    public int solve(int A, int B, int C) {
        return fastPOwer((long)A,B,C);
        // long ans=1;
        // for(int i=0; i<B; i++) {
        //     ans = (ans*A)%C;
        // }
        // return (int)ans%C;
    }
}
