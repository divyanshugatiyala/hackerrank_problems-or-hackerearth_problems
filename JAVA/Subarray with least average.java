public class Solution {
    public int solve(int[] A, int B) {
        double min_avg = (double)Integer.MAX_VALUE;

        long sum=0;
        int idx=0;
        for(int i=0; i<A.length; i++){
            sum += A[i];

            if(i>=B-1){
                double avg = (double)sum/B;
                if(avg< min_avg){
                    min_avg=avg;
                    idx=i-(B-1);
                }
                sum -= A[i-(B-1)];
            }
        }

        return idx;

    }
}
