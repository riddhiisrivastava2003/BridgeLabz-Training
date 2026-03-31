import java.util.Arrays;

class NumberCheckerCode {
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
		
		for(int i = count - 1 ; i >= 0 ; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		
		return digits;
	}

	
	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];
		int index = 0;
		
		for(int i = arr.length - 1 ; i >= 0; i--) {
			reversed[index++] = arr[i];
		}
		return reversed;
	}

	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0 ; i<arr1.length ; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
			
			
		}return true;
	}

	public static boolean isPalindrome(int number) {
		int[] original = storeDigits(number);
		int[] reversed = reverseArray(original);
		return compareArrays(original , reversed);
		
		}

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        for (int digit : digits) {
            if (digit != 0) {
                return true;  
            }
        }
        return false;
    }	

}

public class NumberChecker3{
	public static void main(String[] args) {
		int number = 17209;

		System.out.println("Number of digits: " + NumberCheckerCode.countDigits(number));
        int[] digits = NumberCheckerCode.storeDigits(number);
		System.out.println("Digits array: " + Arrays.toString(digits));
		int[] reversed = NumberCheckerCode.reverseArray(digits);
		System.out.println("Reversed Array: " + Arrays.toString(reversed));
		System.out.println("Arrays are equal: " + NumberCheckerCode.compareArrays(digits , reversed));
		System.out.println("Is plaindrome : " + NumberCheckerCode.isPalindrome(number));
		System.out.println("Is Duck Number : " + NumberCheckerCode.isDuckNumber(number));
	}
	
}