import java.util.*;

class Quiz{
	public static int calculateScore(String[] correct, String[] student) {
		int score=0;
		
		System.out.println("quiz feedback");
		
		for(int i=0;i<correct.length;i++) {
			if(student[i].equalsIgnoreCase(correct[i])) {
				System.out.println("question "+(i+1)+": correct");
				score++;
			}
			else {
				System.out.println("question "+(i+1)+": incorrect"+"(correct answer: "+correct[i]+")");
			}
		}
		return score;
	}
}

public class EduQuiz {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String[] correctAnswers= {"A","B","C","D","A","C","B","D","A","C"};
		
		String[] studentAnswers=new String[10];
		
		System.out.println("enter student answers (A/B/C/D): ");
		for(int i=0;i<studentAnswers.length;i++) {
			System.out.print("question "+(i+1)+": ");
			studentAnswers[i]=sc.nextLine();
		}
		
		int score=Quiz.calculateScore(correctAnswers, studentAnswers);
		
		double percentage=(score/10.0)*100;
		System.out.println("total score: "+score +"/10");
		System.out.println("percentage: "+percentage+"%");
		
		if(percentage>=50) {
			System.out.println("result: pass");
		}
		else {
			System.out.println("result: fail");
		}
	}

}
