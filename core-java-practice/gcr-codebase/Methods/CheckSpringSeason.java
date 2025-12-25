
import java.util.*;
public class CheckSpringSeason {

	public static boolean isSpring(int month , int day) {
		if((month == 3 && day >= 20) || (month == 4 ) || (month == 5) || (month == 6 && day <= 20)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int month =Integer.parseInt(args[0]);


		int day = Integer.parseInt(args[1]);
	
		boolean results = isSpring( month , day);
			if (results) {
				System.out.println("it is  Spring ");
			}else {
				System.out.println("Not a Spring ");
			}
		

	}

}
