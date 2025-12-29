import java.util.*;
public class DigitalWatchSimulation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		for(int hour=0;hour<24;hour++) {
			for(int minutes=0;minutes<60;minutes++) {
				
				System.out.printf("%02d:%02d\n",hour,minutes);
				
				if(hour==13 && minutes==0) {
					
					System.out.println("Power Cut Time");
					break;
				}
				
				
			}
			
			if(hour==13)
				break;
			
		}
		}
	

}
