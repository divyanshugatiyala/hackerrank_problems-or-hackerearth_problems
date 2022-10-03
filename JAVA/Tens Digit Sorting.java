public class Solution {
    
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2){
                    int d1 = (e1/10)%10;
                    int d2= (e2/10)%10;
                    if(d1==d2) {
                        if(e1>e2) return -1;
                        else if(e1<e2) return 1;
                        else return 0;
                    }
                    else if(d1>d2) return 1;
                    else  return -1;
            }
        });
        return A;

    }
}
