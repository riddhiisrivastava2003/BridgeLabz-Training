

import java.util.*;

class MathUtility{
	
	//1. factorial
	
	public static long factorial(int n) {
		if(n<0) {
			System.out.println("factorial not defined for negative numbers");
			return -1;
		}
		
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	
	//2. prime check method
	
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	//3. gcd method(euclidean algorithm)
	
	public static int gcd(int a,int b) {
		if(a<0) a=Math.abs(a);
		if(b<0) b=Math.abs(b);
		
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	//4. nth fibonacci method
	
	public static long fibonacci(int n) {
		if(n<0) {
			System.out.println("fibonacci not defined for negative numbers");
			return -1;
		}
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		long a=0,b=1,c;
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
}

public class MathOperation {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		//factorial
		
		System.out.println("enter number for factorial");
		int fact=sc.nextInt();
		System.out.println("factorial: "+MathUtility.factorial(fact));
		
		//prime check
		
		System.out.println("enter number to check prime");
		int num=sc.nextInt();
		System.out.println(num+" is prime? "+MathUtility.isPrime(num));
		
		//gcd
		
		System.out.println("enter two numbers for gcd");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("gcd: "+MathUtility.gcd(a, b));
		
		//fibonacci
		
		System.out.println("enter n for fibonacci");
		int fib=sc.nextInt();
		System.out.println("fibonacci("+fib+"): "+MathUtility.fibonacci(fib));
		
	}

}
