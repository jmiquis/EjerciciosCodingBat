package map2;

import java.util.Collection;
import java.util.HashMap;

public class WordAppend {

	public static void main(String[] args) {
		String[] strings= {"a", "b", "a", "c", "a", "d", "a"};
		System.out.println(wordAppend(strings));

	}
	public static Collection<String> wordAppend(String[]strings) {
		HashMap <String, String> hashmap=new HashMap<String,String>();
		for (int i=0;i<strings.length;i++) {
			int counter=0;
			if(!(hashmap.containsKey(strings[i]))){
				hashmap.put(strings[i],"");
				for (int j=0;j<strings.length;j++) {
					if(i!=j && strings[j]==strings[i]) {
						hashmap.get(strings[i]+=strings[j]);
					}
				}
			}
		}
		return hashmap.values();
	}
}
