package array3;

import java.util.Arrays;

public class SquareUp {

	public static void main(String[] args) {
		int squareUp= 3;
		System.out.println(Arrays.toString(squaredUp(squareUp)));
	}
	public static int[] squaredUp(int n) {
		int [] array=new int[n*n];
		int increase=1;
		for(int i=array.length-1;i>=0;i--) {
			array[i]=increase;
			increase=(increase+1>n)?1:increase+1;
		}
		int saved=1;
		for (int j=0;j<array.length;j++) {
			array[j]=(array[j]>saved)?0:array[j];
			saved=(array[j]==1)?saved+1:saved;
		}
		return array;
	}

}
