import java.util.Scanner;
public class FindEmployeesBonus{

	public static int[][] calculateData(int n ){

		int[][] data = new int[n][2] ;
		for(int i = 0; i<n;i++) {
			data[i][0] = 10000 + (int)(Math.random() * 90000);

			data[i][1] = 1 + (int)(Math.random() * 10);
		}
		return data;
	}


	public static double[][] bonus(int[][] data){
		double[][] result =new double[data.length][2];
		
		for(int i = 0; i< data.length; i++) {

			double rate = (data[i][1] > 5 ) ? 0.05 : 0.02;

			result[i][1] = data[i][0] * rate;


			result[i][0] = data[i][0] + result[i][1];
			
		}
		return result;
	}

	public static void display(int[][] oldData, double[][] newData) {

		double totalOld = 0 , totalBonus = 0,  totalNew = 0;

		System.out.println("employee      old salary    years    bonus    new salary ");
		
		for(int i = 0 ; i<oldData.length; i++) {

			totalOld += oldData[i][0];

			totalBonus += newData[i][1];

			totalNew += newData[i][0];

			System.out.println((i+1) + "   " + oldData[i][0] + "    " + oldData[i][1] + "  " + newData[i][1] + "  " + newData[i][0]);
			
		}System.out.println("Total " + totalOld + "    " + totalBonus + "    " + totalNew);
		
	}
	public static void main(String[] args) {
		int[][] employeeData = calculateData(10);
		double[][] updatedData = bonus(employeeData);
		display(employeeData, updatedData);
		

	}

}
