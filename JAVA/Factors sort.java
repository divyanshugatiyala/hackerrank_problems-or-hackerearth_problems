import java.util.*;
import java.io.*;
public class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public boolean compare(int a, int b) {
            int c1= countOfFactor(a);
            int c2= countOfFactor(b);
            if(c1>c2) return true;
            else if(c1==c2 && a>b) return true;
            else return false;
    }
    
    public int countOfFactor(int n) {

        if(map.containsKey(n)) return map.get(n);
        int count=0;

        for(int i=1; i*i<=n; i++) {
            if(n%i==0){
                if(n/i==i) count++;
                else count+=2;
            }
        }
        map.put(n,count);
        return count;
    }
    public int[] solve(int[] A) {
           
    Integer[] what = Arrays.stream( A ).boxed().toArray( Integer[]::new );

        Arrays.sort(what,new Comparator<Integer>() {
        
                    @Override
                    // compare method for the elements
                    // of the structure
                    public int compare(Integer e1, Integer e2) {
                         int c1= countOfFactor(e1);
                         int c2= countOfFactor(e2);
                       //System.out.println(e1+" : "+c1+" , "+e2+" : "+ c2);
                          if (c1 == c2)
                        return e1-e2;
               
                // sort in decreasing order of number of factors
                         return c1-c2;
                         
                       
                    }
                    
                });

             int[] ans = new int[A.length];
             int z=0;
             for(Integer ele: what) ans[z++]=ele;
            return ans;
    }
}
