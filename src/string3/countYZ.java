package string3;

public class countYZ {

	public static void main(String[] args) {
		String str="!!day--yaz!!";
		System.out.println(countYZ(str));

	}
	public static int countYZ (String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i)) && i>0){
				if(Character.toLowerCase(str.charAt(i-1))=='y' || Character.toLowerCase(str.charAt(i-1))=='z' ) {
					sum++;
				}
			}
			if(i==str.length()-1) {
				if(Character.toLowerCase(str.charAt(i))=='y' || Character.toLowerCase(str.charAt(i))=='z') {
					sum++;
				}
			}
		}
		return sum;
	}

}
