package ap1;

public class ScoresIncreasing {
public static void main(String[] args) {
	String[]array= {"aa", "bb", "cc"};
	String [] romay= {"", "", "ccc"};
	System.out.println(matchUp(array,romay));
	
}
public static int matchUp(String[] a, String[] b) {
	  int same=0;
	  char alpha='r';
	  char beta='r';
	  for(int i=0;i<a.length;i++){
	     try {
	    	 alpha=a[i].charAt(0);
			 beta=b[i].charAt(0);
			 same=(alpha==beta)?same+1:same;
		} catch (Exception e) {
					}
	     
	   }
	  
	  return same;
	}
}
