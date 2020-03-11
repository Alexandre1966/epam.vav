package algorithm_array;

import java.util.Arrays;
import java.util.Random;

public class Initarray {

	public static void main(String[] args) {

		int n = 15;
		
		int [] mas = new int[n];
		
		initArray(mas);

		System.out.println(Arrays.toString(mas));
 
	}

	public static void initArray(int[] mas) {

		if (mas == null) {

			return;
		}
		
     Random rand = new Random();
     
     for (int i = 0; i < mas.length; i++) {
       	
    	 mas[i] = rand.nextInt(1000)*(rand.nextDouble()> 0.5 ? 1:-1);
    	 
	}
     
}
	
}
