package javaTask_B;

import java.util.Scanner;

public class Question_F {

	public static void main(String[] args) {
	
		//	Write a program to calculate the hotel tariff. 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("user enter month");
		int month = scan.nextInt();
		
		System.out.println("system write room rent per day");
		float roomrent = scan.nextFloat();
		
		System.out.println("user enter number of days for stay");
		int numofdays = scan.nextInt();
		
		double totaltarif=roomrent*numofdays;
		double 	peakdays = 1.2 ;
			
		switch (month) {
		case 4:
		case 6:
		case 11:
		case 12:
			double peakdaystarif = totaltarif*peakdays;
			System.out.println(peakdaystarif);
			break;
			default:
				System.out.println(totaltarif);
		}
//		normal days
//		user enter month
//		5
//		system write room rent per day
//		3000
//		user enter number of days for stay
//		2
//		6000.0
		
		
//		peak days		
//		user enter month
//		11
//		system write room rent per day
//		3000
//		user enter number of days for stay
//		2
//		7200.0
		
		

	}

}
