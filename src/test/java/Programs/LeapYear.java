package Programs;

import org.testng.annotations.Test;

public class LeapYear {



	@Test
	public void test() {

		boolean leap=false;
		int year=2020;

		if(year%4==0) {
			if(year%100==0) {

				if(year%400==0) {
					leap=true;

				}else {
					leap=false;

				}



			}
			else {
				leap=true;
			}

		}
		else {

			leap=false;
		}

		if(leap) {

			System.out.println("Leap year");
		}else {
			System.out.println("Not Leap year");
		}
	}
}
