package javaTask_B;

import java.util.Scanner;

public class Question_B {
	//2. Write a program that reads in a string from the user and uses a loop to reverse the order of the characters in the string. Then, output the reversed string.

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Type the String");
	String string = scn.next();
	String rev ="";
	
	for (int i=string.length()-1; i>=0; i--) {
		char chat = string.charAt(i);
		
		rev = rev+chat;
		
	}
	System.out.println(rev);
	
	
}
}
