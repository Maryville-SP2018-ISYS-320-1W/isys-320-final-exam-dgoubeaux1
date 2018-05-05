package edu.maryville.isys320;

import java.util.Scanner;

/*
 * Class:    ISYS-320
 * Student:  Destiny Goubeaux
 * Date:     30-APR-2018
 */

public class FinalExam {

	public static void main(String[] args) {
		
		
	}
		
		public static void squaredDifference(){
			Scanner sD = new Scanner(System.in);
			double a = sD.nextDouble();
			double b = sD.nextDouble();
		
		System.out.print(Math.pow( (a - b), 2));
	}
	
		public static void printSquares( int max ) {
			
		    for( int i = 1; i <= max; i++ ) {
		       int square =  i * i;
		       
		       System.out.println(square);
		    }
		 
		}
		    
		

		public static void distance() {
		

		Scanner distanceFinder = new Scanner(System.in);
		
		System.out.println("Enter x, y for first point: ");
		
		double firstPointX = distanceFinder.nextDouble();
		double firstPointY = distanceFinder.nextDouble();
		
		System.out.println("Enter x, y for second point: ");
		
		double secondPointX = distanceFinder.nextDouble();
		double secondPointY = distanceFinder.nextDouble();
			double distance = Math.sqrt((Math.pow(firstPointX, 2) - Math.pow(secondPointX, 2))+((Math.pow(firstPointY, 2) - Math.pow(secondPointY, 2))));
		System.out.println("The distance is " + distance);
		} 
			
		
	
	public static void triangleWorld(String n){
		Scanner word = new Scanner(System.in);
		String wordInput = word.nextLine();
		
		n = wordInput;  
		
		for (int i = n.charAt(i); i < n.length(); i++) {
			for (int j = n.charAt(j); j <= i; j++)
				System.out.print(j);
			System.out.println();
			
		}
	
		for (int i = n.charAt(i); i >= 0; i--) {
			for (int j = n.charAt(j); j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println();
	}
	//Not sure if this one is right or not. I tried. 

	public static void golfTracker(){
		
		Scanner golfScore = new Scanner(System.in);
		System.out.println("What is the par for the course? ");
		int numberPar = golfScore.nextInt();
		
		System.out.println("Enter your next score: ");
		int score1 = golfScore.nextInt();
		System.out.println("Enter your next score: ");
		int score2 = golfScore.nextInt();
		System.out.println("Enter your next score: ");
		int score3 = golfScore.nextInt();
		System.out.println("Enter your next score: ");
		int score4 = golfScore.nextInt();
	
	double average = ((score1 + score2 + score3 + score4) / numberPar);
	
	double totalScore = (average - numberPar);
		
	System.out.println("On this game your total score is " + totalScore);
	
	
	}



}
