package week2.day2;

import java.util.Iterator;

public class Findduplicatevaluesofarray {
	public static void main(String[] args) {
		int [] age= {2,5,7,7,5,9,2,3};
		
	 for (int i = 0; i < age.length; i++) {
		 
		for (int j = i+1; j < age.length; j++) {
			
			if(age[i]==age[j]) {
				
				System.out.println("Duplicate age:" +age[j]);
			}
			
		}
		
	}
	}

}
