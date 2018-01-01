package Strings;

public class ReverseStringRecursive {
	
	public static void main(String[] args) {
	        String reversed = reverseString("Harry");
	        System.out.println("The reversed string is: " + reversed);
	}
	
	public static String reverseString(String inputStr){
		   if (inputStr.isEmpty())
	            return inputStr;
		   return reverseString(inputStr.substring(1)) + inputStr.charAt(0);
	}
}
