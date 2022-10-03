public class Solution {
    public int solve(int[] A) {
        int count=0;
        for(int ele:A) count+=ele;

        if(count%3==0) return 1;
        else 
        return 0;
    }
}
