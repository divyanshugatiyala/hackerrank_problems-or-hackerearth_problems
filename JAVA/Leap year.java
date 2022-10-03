public class Solution {
    public int solve(int A) {

        if(  (A%100  !=0 && A%4==0 ) || A%400==0) return 1;
        else return 0;
    }
}
