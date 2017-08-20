
public class Fibonacci {
	
	public static void main(String[] args) {
		//0 1 1 2 3 5 8...
		int[] fibonacciNumbers = new int[25];
		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;
	    for (int i = 0; i < fibonacciNumbers.length-2 ; i++) {
			fibonacciNumbers[i+2] = fibonacciNumbers[i] + fibonacciNumbers[i+1];
		}
	    
	    for (int i = 0; i < fibonacciNumbers.length; i++) {
			System.out.print(fibonacciNumbers[i] + ", ");
		}
		
	}

}
