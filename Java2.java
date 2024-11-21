package javaProgramming;

public class Java2 {

	public static void main(String[] args) {
		String input = "Mysore City";
		String reversed = "";
		for (int i=input.length()-1;i>=0;i--) {
			reversed += input.charAt(i);
			
			
		}
System.out.println("Original string:"+input);
System.out.println("Reversed string:"+ reversed);
	}

}
