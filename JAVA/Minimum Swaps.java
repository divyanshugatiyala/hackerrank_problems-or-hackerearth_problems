public class Solution {
    public int solve(int[] A, int B) {
        if(A.length<=1)
        return 0;
        int k=0;
        for(int ele:A) if(ele<=B) k++;

        if(k==0)
       return 0;

        int max_count = Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<A.length; i++){
               if(A[i]<=B) count++;

               if(i>=k-1){
                   max_count =Math.max(max_count,count);
                   if(A[i-(k-1)]<=B) count--;
               } 
        }

        return k-max_count;
    }
}
