package sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		for(int size = 10; size < 1_000_000; size*=2){
			testTimeForSize(size);
		}
	}
	
	public static void testTimeForSize(int size){
		int[] a = generateRandomIntArray(size);
		
		long startTime = System.currentTimeMillis();
		
		//InsertionSort.sort(a);
		Arrays.sort(a);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time elapsed("+size+") : " + (endTime - startTime)/1000.0F);
	}
	
	public static int[] generateRandomIntArray(int sizeOfArray){
		int[] myArray = new int[sizeOfArray];
		Random r = new Random();
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = r.nextInt();
		}
		return myArray;
	}

}
