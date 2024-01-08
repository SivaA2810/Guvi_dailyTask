package javaTask_B;

import java.util.Scanner;

public class Question_E {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input marks from the user
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        
        if(marks >= 90 && marks <= 100) {
        	System.out.println(" 'S'-grade");
        }
        else if(marks >= 80 && marks <= 89) {
        	System.out.println(" 'A'-grade");
        }
        else if(marks >= 70 && marks <= 79) {
        	System.out.println(" 'B'-grade");
        }
        else if(marks >= 60 && marks <= 69) {
        	System.out.println(" 'C'-grade");
        }
        else if(marks >= 50 && marks <= 59) {
        	System.out.println(" 'E'-grade");
        }
        else if(marks >= 01 && marks <= 49) {
        	System.out.println(" 'U'-grade");
        }
        
      // mark = 86 
      // output=  'A'-grade
       
	}
	}


	

