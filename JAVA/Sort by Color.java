public class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortColors(int[] A) {
        
        int c0=0,c1=0,c2=0;
        for(int ele:A) {
            if(ele==0) c0++;
            else if(ele==1) c1++;
            else c2++;
        }
        for(int i=0; i<c0; i++) A[i]=0;
        for(int i=c0; i<c0+c1; i++) A[i]=1;
        for(int i=c0+c1; i<c0+c1+c2; i++) A[i]=2;

        return A;
    
    }
}
