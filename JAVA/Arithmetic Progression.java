public class Solution {
    public int solve(int[] A) {

         int min = Integer.MAX_VALUE, max= Integer.MIN_VALUE;
         for(int ele:A) {
             min = Math.min(min, ele);
             max= Math.max(max, ele);
         }
        int len = A.length;
        // an = a1+(n-1)d
         if( (max-min)%(len-1)!=0) return 0;
         int d = (max-min)/(len-1);
         int i=0;

         while(i<len) {
             if(A[i]==min+d*i) i++;
             else if( (A[i]-min)%d !=0 ) return 0;
             else {
                 int pos = (A[i]-min)/d;
                 if(pos<i  || A[pos]==A[i]) return 0;
                 int temp = A[pos];
                 A[pos]=A[i];
                 A[i]= temp;
             }
         }
         return 1;

    }
}
