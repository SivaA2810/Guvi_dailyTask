package javaTask_B;

public class Question_A {

	public static void main(String[] args) {
		
	String s1 = "malayal";
	String rev="";
	
	for(int i=s1.length()-1; i>=0; i--) {
		
		char chat = s1.charAt(i);
		rev=rev+chat;
		
	}
	System.out.println(rev);
		if (s1.equals(rev)) {	
			System.out.println("the given string is polidrome");
		}   
		else {
			System.out.println("the given String is not polindrome");
		}
		}
		}

	


