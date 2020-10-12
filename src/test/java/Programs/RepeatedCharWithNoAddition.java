package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepeatedCharWithNoAddition {


	public static void main(String[] args) {


		String output=processInput("a1b2c3a5d2b2a0c5d7");

		System.out.println(output);



	}


	public static String processInput(String str) {


		LinkedHashMap<String, Integer> calData=new LinkedHashMap<String, Integer>();

		for(int i=0;i<str.length();i=(i+2)) {
			String processData=str.substring(i, i+2);
			String key=processData.substring(0,1);
			Integer value=Integer.parseInt(processData.substring(1, 2));

			if(calData.containsKey(key)) {

				value=value+calData.get(key);
				calData.put(key, value);
			}else {
				calData.put(key, value);

			}



		}
		StringBuffer result=new StringBuffer();

		for(Map.Entry<String, Integer> mapData:calData.entrySet()) {

			result.append(mapData.getKey());
			result.append(mapData.getValue());
		}


		return result.toString();
	}


}

