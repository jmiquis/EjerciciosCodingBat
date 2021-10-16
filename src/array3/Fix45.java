package array3;
import java.util.Arrays;

public class Fix45 {

	public static void main(String[] args) {
		int[] array= {4, 5, 4, 1, 5};
		System.out.println(Arrays.toString(fixIt(array)));
	}
	public static int[] fixIt(int [] nums) {
		int fourPosition=-1;
		int fivePosition=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==4 && nums[i+1]!=5) {
				fourPosition=i;
				for(int j=fivePosition;j<nums.length;j++) {
					if(nums[j]==5) {
						if(j==0) {
							fivePosition=0;
							break;
						}
						else {
							if(nums[j-1]!=4) {
								fivePosition=j;
								break;
							}
						}
					}
				}
				int aux=nums[fourPosition+1];
				nums[fourPosition+1]=5;
				nums[fivePosition]=aux;
			}
		}
		
		return nums;
	}
}
