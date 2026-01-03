import java.util.*;


class TemperatureAnalyzer{
	public static void analyzeTemperature(float[][] temp) {
		
		float hottestAvg=temp[0][0];
		float coldestAvg=temp[0][0];
		
		int hottestDay=0;
		int coldestDay=0;
		
		System.out.println("average temperature per day: ");
		
		for(int day=0;day<7;day++) {
			float sum=0;
			
			for(int hour=0;hour<24;hour++) {
				sum=sum+temp[day][hour];
			}
			float avg=sum/24;
			System.out.println("day"+(day+1)+": "+avg);
			if(avg > hottestAvg) {
				hottestAvg=avg;
				hottestAvg=day;
				
				
			}
			
			if(avg < coldestAvg) {
				coldestAvg=avg;
				coldestAvg=day;
				
				
			}
			
			
		}
		
		System.out.println("hottest day: day "+(hottestDay+1));
		System.out.println("coldest day: day "+(coldestDay+1));
		
		
	}
}

public class Temperature {
	
	public static void main(String args[]) {
		float[][] temperature=new float[7][24];
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<24;i++) {
				temperature[i][j]=20+(float)(Math.random()*15);
			
			}
		}
		
		TemperatureAnalyzer.analyzeTemperature(temperature);
		}

}
