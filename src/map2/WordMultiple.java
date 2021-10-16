package map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

	public static void main(String[] args) {
		String[] strings= {"a", "b", "a", "c", "b"};
		System.out.println(mapeo(strings));

	}
	public static Map <String, Boolean> mapeo(String[] strings){
		
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		for (int i=0;i<strings.length;i++) {
			String key=strings[i];
			if(!(hm.keySet().contains(key))) {
				boolean bool=false;
				for(int j=0;j<strings.length;j++) {
					if(j!=i && strings[j]==key) {
						hm.put(key, true);
						break;
					}
					hm.put(key, false);
				}
			}
		}
		return hm;
	}

}
