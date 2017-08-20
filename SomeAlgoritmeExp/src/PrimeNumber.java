
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("This number is " + (isPrimeNumber(6) ? "prime" : "not prime"));

	}
	
	private static Boolean isPrimeNumber(int number){
		Boolean flag = Boolean.TRUE; 
		for (int i = number-1; i > 2; i--) {
			if(number%i == 0){
				flag = Boolean.FALSE;
				break;
			}
		}
		return flag;
	}
}
