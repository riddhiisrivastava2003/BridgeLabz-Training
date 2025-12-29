import java.util.*;


public class EmployeeWageCalculationProblem {
	
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	static final int PART_TIME_HOUR=4;
	static final int WORKING_DAYS=20;
	static final int MAX_WORKING_HOURS=100;
	
	
	//uc-1 employee attendance ko check karna h 
	
	public static boolean attendanceCheck() {
		
		System.out.println("Use Case-1: EMPLOYEE ATTENDANCE CHECK");
		int attendance=(int)(Math.random()*2);//0 or 1 ayega;
		
		if(attendance==1) {
			System.out.println("The employee is present");
			return true;
			
		}
		else {
			System.out.println("The employee is absent");
			return false;
			
		}
		
		//return attendance;
		
	}
	
	//uc-2 daily employee wage calculate karna h 
	//Assume full time Hour is 8 and wage per hour is 20
	
	public static int dailyEmployeeWage() {
		System.out.println("Use Case-2: calculating daily wage(full time)");
		int dailyWage= WAGE_PER_HOUR*FULL_DAY_HOUR;
		System.out.println("Wage per hour "+WAGE_PER_HOUR);
		System.out.println("the daily wage is "+dailyWage);
		
		return dailyWage;
		
	}
	//use case 3 part time 
	//Assume Part time Hour is 4
	
	public static int calculatingPartTimeWage() {
		System.out.println("Use Case-3: Part time employee wage");
		int partTimeWage=WAGE_PER_HOUR*PART_TIME_HOUR;
		System.out.println("part time wage is "+partTimeWage);
		return partTimeWage;
		}
	
	
	//Use case 4 switch case implementation 
	
	public static int calculatingWage(Scanner sc) {
		System.out.println("Use Case-4: Wage calculation bia switch case implementation");
		
		System.out.println("enter the employee(1-full and 2-part)");
		int employeeType=sc.nextInt();
		int wage=0;
		switch(employeeType) {
		case 1:
			System.out.println("the employee type is full time");
			wage=WAGE_PER_HOUR*FULL_DAY_HOUR;
			break;
			
		case 2:
			System.out.println("the employee type is part time");
			wage=WAGE_PER_HOUR*PART_TIME_HOUR;
			break;
		default:
			System.out.println("the employee is absent");
			wage=0;
		}
		System.out.println("daily wage of the employee "+wage);
		return wage;
	}
	
	//use case 5 calculation of wages for a month
	//Assume 20 Working Day per Month
	
	public static void calculationOfMonthlyWage() {
		System.out.println("use case-5: calcution of monthly wage");
		int monthlyWage=WAGE_PER_HOUR*FULL_DAY_HOUR*WORKING_DAYS;
		System.out.println("assuming 20 working days,monthly wage "+monthlyWage);
	}
	
	//use case-6 calculating wages till a condition of total working hours or days is reached for a month
	
	public static void calculateWageTillCondition(Scanner sc) {
		System.out.println("use case-6 wage till max days");
		int hours=0;
		int days=0;
		int wage=0;
		
		
		while(hours<MAX_WORKING_HOURS && days<WORKING_DAYS) {
			
			days++;
			System.out.println("enter employee type for day "+days+" (1-full,2-part)");
			int employeeType=sc.nextInt();
			int hoursWorked=0;
			
			switch(employeeType) {
			case 1:
				hoursWorked=FULL_DAY_HOUR;
				break;
			case 2:
				hoursWorked=PART_TIME_HOUR;
				break;
			default:
				hoursWorked=0;
				
			}
			
			if(hours+hoursWorked>MAX_WORKING_HOURS) {
				hoursWorked=MAX_WORKING_HOURS-hours;
			}
			
			hours=hours+hoursWorked;
			wage=wage+hoursWorked*WAGE_PER_HOUR;
			
			
			
		}
		
		int equivalentFullDays=hours/FULL_DAY_HOUR;
		int remainingHours=hours%FULL_DAY_HOUR;
		
		System.out.println("total hours worked= "+hours);
		System.out.println("equivalent full days "+equivalentFullDays);
		System.out.println("actual days counted "+wage);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		boolean present=attendanceCheck();
		
		if(present) {
			dailyEmployeeWage();
			calculatingPartTimeWage();
			calculatingWage(sc);
			calculationOfMonthlyWage();
			calculateWageTillCondition(sc);
			
			
		}
		else {
			System.out.println("employee absent");
		}
	}
	
	
	

}
