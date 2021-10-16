package map2;
import java.util.HashMap;
import java.util.Map;

public class FirstChar {

	public static void main(String[] args) {
		String str[]= {"salt","tea","soda","toast"};
		System.out.println(firstMap(str));
		
	}
	public static Map <String, String> firstMap(String [] str){
		Map<String, String> mapa=new HashMap<String, String>();
		for (int i=0;i<str.length;i++) {
			String titulo=str[i];
			String letra="";
			letra+=str[i].charAt(0);
			for (int j=0;j<str.length;j++) {
				if(i!=j && str[j].charAt(0)==letra.charAt(0)) {
					titulo+=str[j];
				}
			}
			if((!mapa.keySet().contains(letra)))
			mapa.put(letra, titulo);
		}
		return mapa;
	}
}
