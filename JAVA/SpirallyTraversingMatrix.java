import java.util.ArrayList;

public class SpirallyTraversingMatrix {

	public static void main(String[] args) {
		int matrix[][] = {{9, 2, 0, 4},
		           {1, 6, 0, 2},
		           {9, 0, 1, 7},
		           {9, 4, 1,0}};
		int r=4,c=4;
		int top=0;
		int down=r-1;
		int left=0;
		int right=c-1;
		int dir=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(top<=down && left<=right) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
				al.add(matrix[top][i]);
				}
				top+=1;
			}
			if(dir==1) {
				for(int i=top;i<=down;i++) {
				al.add(matrix[i][right]);
				}
				right-=1;
			}
			if(dir==2) {
				for(int i=right;i>=left;i--) {
				al.add(matrix[down][i]);
				}
				down-=1;
			}
			if(dir==3) {
				for(int i=down;i>=top;i--) {
				al.add(matrix[i][left]);
				}
				left+=1;
			}
			dir=(dir+1)%4;
		}
		for (int i = 0; i <al.size(); i++) 
            System.out.print(al.get(i) + " "); 
	}

}
