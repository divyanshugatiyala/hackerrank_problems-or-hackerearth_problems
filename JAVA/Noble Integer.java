public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2) {
                if(e1==e2) return 0;
                else if(e1>e2) return 1;
                else return -1;
            }
        });

        for(int i=0; i<A.size();){
            int ele=A.get(i);

            while(i<A.size()&& ele==A.get(i)) i++;
            if(ele== A.size()-i) return 1;
        }
        return -1;
    }
}
