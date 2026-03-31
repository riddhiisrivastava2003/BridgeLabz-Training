

import java.util.*;

class StudentScore{
	
	public static void analyzeScore(int[] scores) {
		int sum=0;
		int highest=scores[0];
		int lowest=scores[0];
		
		
		for(int score:scores) {
			sum=sum+score;
			
			if(score>highest) {
				highest=score;
			}
			
			if(score<lowest) {
				lowest=score;
			}
		}
		
		double average=(double) sum/scores.length;
		
		System.out.println("average score: "+average);
		System.out.println("highest score: "+highest);
		System.out.println("lowest score: "+lowest);
		
		System.out.println("scores above average");
		for(int score:scores) {
			if(score>average) {
				System.out.print(score+" ");
			}
		}
		
	}
	
}

public class StudentScores {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter number of students");
		int n=sc.nextInt();
		
		int[] scores=new int[n];
		
		for(int i=0;i<n;i++) {
			while(true) {
				System.out.print("enter score for student "+(i+1));
				
				if(!sc.hasNextInt()) {
					System.out.println("invalid input");
					sc.next();
					continue;
				}
				
				int score=sc.nextInt();
				
				if(score<0) {
					System.out.println("score cannot be negative");
				}
				else {
					scores[i]=score;
					break;
				}
			}
		}
		
		StudentScore.analyzeScore(scores);
	}

}
