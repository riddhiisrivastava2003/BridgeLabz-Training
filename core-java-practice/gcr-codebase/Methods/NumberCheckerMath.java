import java.util.*;

class NumberChecker {
	public static int countDigits(int number) {
		int count = 0 ;
		while( number != 0) {
			count++;
			number /= 10;
			
		}
		return count;
	}
	
	public static int[] storeDigits(int number) {
		int count = countDigits(number);
		int[] digits = new int[count];
		
		
		for(int i= count-1 ; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}

	
	public static int sumOfDigits(int[] digits) {
		int sum= 0;
		for(int digit : digits) {
			sum += digit;
			
		}
		return sum;
	}
	
	
	public static int sumOfSquaresOfDigits(int[] digits) {
		int sum = 0;
		for(int digit : digits) {
			sum += (int) Math.pow(digit, 2);
			
		}return sum;
	}

	public static boolean isHarshadNumber(int number) {
		int[] digits = storeDigits(number);
		int sum = sumOfDigits(digits);
		
		return number % sum == 0;
		
	}

	public static int[][] digitFrequency (int[] digits){
		int[][] frequency = new int[10][2];
		
		for(int i = 0; i < 10 ; i++) {
			frequency[i][0] = i;
			frequency[i][1] = 0;
			
		}

		for(int digit : digits) {
			frequency[digit][1]++;
		}
		return frequency;
	}
	
}
public class NumberCheckerMath{
	public static void main(String[] args) {
		int number = 21;
		
		int[] digits = NumberChecker.storeDigits(number);
		System.out.println("Digits : " + Arrays.toString(digits));
		
		//Sum of digits 
		
		System.out.println("Sum of Digits : " + NumberChecker.sumOfDigits(digits));
		System.out.println("Sum of square of digits: " + NumberChecker.sumOfSquaresOfDigits(digits));
		System.out.println("is Harshad Number : " + NumberChecker.isHarshadNumber(number));
		
		int[][] frequency = NumberChecker.digitFrequency(digits);
		System.out.println("Digit Frequency");
		System.out.println("Digit  | Frequency");
		
		for(int i = 0; i< frequency.length; i++) {
			if(frequency[i][1] > 0) {
				System.out.println(" " + frequency[i][0] + "      |          "  + frequency[i][1]);
			}
		}
	}
}
