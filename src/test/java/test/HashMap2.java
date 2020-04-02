package test;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {

		String s1="FB";
		String s2="Ea";

		System.out.println(s1.hashCode()+""+s2.hashCode());
		Map<String, Integer> map 
		= new HashMap<String, Integer>(); 	

		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s2, 3);
		map.put(null, 4);
		map.put("hg", 4);
		map.put("kl", 4);
		map.put("ii", 4);
		map.put("pp", 4);
		map.put("null", 4);
		map.put("jm", 4);
		map.put("po", 4);
		map.put("mm", 4);
		map.put("kk", 4);
		map.put("ll", 4);
		map.put("ooldlk", 4);
		map.put("zz", 4);
		map.put("tt", 4);
		map.put("yy", 4);


	}

}
