public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2) {
                if(e1==e2) return 0;
                else if(e1>e2) return -1;
                else return 1;
            }
        });

        int ans=0;
        for(int i=1; i<=A.size(); i++){
            ans += (A.get(i-1)*i);
        }
        return ans;
    }
}
