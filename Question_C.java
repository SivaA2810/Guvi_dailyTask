package javaTask_B;

public class Question_C {
	//	3. Write a program to print the given below pattern.
	//	Outline
	//	1
	//	2 3
	//	4 5 6
	//	7 8 9 10
	public static void main(String[] args) {
		
		int num=1;
		for(int row =1; row<=5; row++) {
		 for(int colomn =1; colomn<row; colomn++) {
			 System.out.print(num+1 +" ");
			 
		 }
		 System.out.println();
		}
	}
}
