package javaTask_B;

public class Question_D {

//	Write a program to print the given below pattern.
//	Sample Input"
//	*   *
//   * *
//    *
//   * *
//  *   *

	public static void main(String[] args) {
	

		   int size =5;
		        for (int row = 1; row <= size; row++) {
		            for (int colomn = 1; colomn <= size; colomn++) {
		                if (row == colomn || row + colomn == size + 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
			
}
