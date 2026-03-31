import java.util.*;


public class SandeepFitnessChallengeTracker {

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int[] pushups=new int[7];
		
		System.out.println("enter the number of pushups doen on each day of the week and enter 0 on the rest days");
		for(int i=0;i<7;i++) {
			System.out.println("pushups on "+(i+1)+" day");
			pushups[i]=sc.nextInt();
			}
		
		int totalPushups=0;
		int totalWorkoutDays=0;
		
		for(int count:pushups) {
			if(count==0) {
				continue;
			}
			totalPushups=totalPushups+count;
			totalWorkoutDays++;
		}
		
		double average= (double)(totalPushups/totalWorkoutDays);
		
		System.out.println("total pushups are "+totalPushups );
		System.out.println("total workout days are "+totalWorkoutDays);
		System.out.println("average pushups are "+average);
		
		
		
	}
}
