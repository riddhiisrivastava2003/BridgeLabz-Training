import java.util.*;
public class EmployeeBonus{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);

        int employees=10;

        double[] salary=new double[employees];
        double[] yearsOfService=new double[employees];
        double[] bonus=new double[employees];
        double[] newSalary =new double[employees];

        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;

        for(int i=0;i<employees;i++){
            System.out.println("enter details "+(i+1));

            System.out.print("salary: ");
            salary[i]=sc.nextDouble();
            System.out.print("Years of service ");
            yearsOfService[i]=sc.nextDouble();
            if (salary[i]<=0 || yearsOfService[i]<0){
                System.out.println("invalid input");
                i--;
                continue;
            }
                }

                for(int i=0;i<employees;i++){
                    if(yearsOfService[i]>5){bonus[i]=salary[i]*0.05;}
                    else{bonus[i]=salary[i]*0.02;
                    }
                    newSalary[i]=salary[i]+bonus[i];
                    totalBonus =totalBonus+bonus[i];
                    totalOldSalary=salary[i]+totalOldSalary;
                    totalNewSalary=totalNewSalary+newSalary[i];
                }
                System.out.println("total bonus paid "+totalBonus);
                System.out.println("total old salary "+totalOldSalary);
                System.out.println("total new salary "+totalNewSalary);

    }
}
