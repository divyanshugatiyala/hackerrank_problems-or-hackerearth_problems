public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String compare1(Integer e1){
        String s1="";
        while(e1>0) {
            int rem = e1%10;
            s1 = ""+rem+s1;
            e1=e1/10;
        }

        return s1;
    }

     public int compare2(Integer e1){
       int count=0;
        while(e1>0) {
           count++;
            e1=e1/10;
        }

        return count;
    }
   
    public String largestNumber(final List<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2){
               int d1 = compare2(e1);
               int d2= compare2(e2);
               long r1 = e1*(long)Math.pow(10,d2)+e2;
               long r2 = e2*(long)Math.pow(10,d1)+e1;
               //System.out.println(r1+" "+r2);
               if(r1>r2) return -1;
               else if(r1<r2) return 1;
               else return 0;
            }
        });

        String ans="";
       // System.out.println();
        for(int ele:A) {
           // System.out.print(ele+" ");
            ans+=ele;
        }
        if(ans.charAt(0)=='0') return "0";
        return ans;
    }
}
