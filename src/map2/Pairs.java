package map2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Pairs {

	public static void main(String[] args) {
		String str[]= {"man", "moon", "good", "night"};
		System.out.println(mupet(str));
	}
	public static Map<String, String> mupet(String[] str){
		
		
		Map <String, String> mupet=new HashMap();
		for (String i : str) {
			String key="";
			String value="";
			key+=i.charAt(0);
			value+=i.charAt(i.length()-1);
			if(!(mupet.get(key)==value)) {
			mupet.put(key, value);
			}
		}

		 return mupet;
	}

}
