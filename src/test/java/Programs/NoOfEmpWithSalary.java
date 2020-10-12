package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NoOfEmpWithSalary {
	
			//No of emp with the salary
			
			public static void main(String[] args) {
				
				Integer Salary[]= {5000,10000,5000,10000,20000};
				List<Integer> list=Arrays.asList(Salary);
				
				//List<Integer> list=new ArrayList<Integer>();
				
				/*
				 * for(int i=0;i<Salary.length;i++) {
				 * 
				 * list.add(Salary[i]); }
				 */
				
				
				HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
				
				for(Integer sal:Salary) {
					
					Integer count=hm.get(sal);
					
					if(count==null) {
						
						hm.put(sal, 1);
						
					}else {
						
						hm.put(sal, ++count);
						
					}
					
					
					
				}
				
				System.out.println(hm);
				
				
			}

	}

