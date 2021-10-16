package string3;

public class WithoutString {

	public static void main(String[] args) {
		String base="Hello there"; 
		String remove="llo";
		System.out.println(str(base,remove));
	}
	public static String str(String base, String remove) {
		   remove.toLowerCase();
		   base=base.replaceAll(remove, "");
		   return base;
	}

}
