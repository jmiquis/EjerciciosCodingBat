package array3;

public class ScoresAverage {

	public static void main(String[] args) {
		
		int [] array= {4, 4, 4, 2, 2, 2};
		System.out.println(scoresAverage(array));
		

	}
	public static int scoresAverage(int[] scores) {
		
	int firstHalf=scores.length/2;
	int secondHalf=scores.length-firstHalf;
	int sum=0;
	int AVG=0;
	int largest=0;
	
	for(int i=0;i<scores.length;i++) {
		sum+=scores[i];
		AVG=(i<firstHalf)?sum/firstHalf:sum/secondHalf;
		largest=(AVG>largest)?AVG:largest;
		sum=(i==firstHalf-1)?0:sum;
	}
		
	return largest;
	}

}
