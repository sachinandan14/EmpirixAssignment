package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniquePair  {
	
	
	public static List<String> compareFriends(List<String> frndsList) {


        List output = new ArrayList();
        List<String> list = new ArrayList();
        
        for(int i=0;i<frndsList.size();i++) {
        list.add(frndsList.get(i));
        list.forEach(name->System.out.println(name));
        
        
        }
        Set<String> hs = new HashSet<>();

        for (String str : list) {
            String[] pairs = str.split(",");
            String i1 = pairs[0];
            String i2 = pairs[1];
            String key = i1.compareTo(i2) > 0 ? i2 + "," + i1 : i1 + "," + i2;
            hs.add(key);
        }
        Iterator val = hs.iterator();
        while (val.hasNext()) {
            output.add(val.next());
        }
        Collections.sort(output);
        System.out.println("result" + output);
        return output;


    }


	
	
	public static void main(String args[]) {
		
		List<String> list = Arrays.asList("U1,U2", "U3,U4", "U2,U1", "U1,U5","U4,U3");
		 /*Set<String> hs = new HashSet<>();
		 for (String str : list) {
		String[] pairs = str.split(",");
        String i1 = pairs[0];
        String i2 = pairs[1];
        String key = i1.compareTo(i2) > 0 ? i2 + "," + i1 : i1 + "," + i2;
        hs.add(key);*/

		List<String> op=compareFriends(list);
		System.out.println(op);
		
		
}}
