
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orginalText = "dad";
		String reverseText = "";
		
		for(int i = orginalText.length(); i > 0; i-- ){
			reverseText = reverseText + orginalText.charAt(i-1);
		}
		
		if(reverseText.equals(orginalText)){
			System.out.println("This word is polindrome");	
		}else{
			System.out.println("This word isn't polindrome");
		}
		
		

	}

}
