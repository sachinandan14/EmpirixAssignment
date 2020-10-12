package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElemMap {
	
	
	public static void main(String[] args) {
		
		
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		
		
		HashMap<String , Integer> hm=new HashMap<String, Integer>();
		
		for(String name:names) {
			
			Integer count=hm.get(name);
			if(count==null) {
				hm.put(name, 1);
				
			}else {
				hm.put(name, ++count);
			}
			
		}
		
		       Set<Entry<String, Integer>>entry=hm.entrySet();
		       for(Entry<String,Integer> ent:entry) {
		    	 if(ent.getValue()>1){
		    		   System.out.println("Duplicate elem: "+ent.getKey());
		    	   }
		    	   
		       }

	}

}
