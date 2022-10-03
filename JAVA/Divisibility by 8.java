public class Solution {
    public int solve(String A) {
        int n = A.length();        
      
        int num=0;
        int power=1;
        for(int i=n-1; i>=Math.max(0,n-3); i--){
                num +=  (A.charAt(i)-48)*power;
                power*=10; 
        }
        
        if(num%8==0) return 1; 
        else return 0;
        
       
    }
}
