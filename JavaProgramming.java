package javaProgramming;

public class JavaProgramming {

	public static void main(String[] args) {
		String string = "Deepa";
		boolean flag = true;
		
		string= string.toLowerCase();
		for (int i=0;i<string.length()/2;i++) {
			flag=false;
		}
if(flag)
	System.out.println("Given string is palindrome");
else 
	System.out.println("Given string is not a palindrome");
	}

}
