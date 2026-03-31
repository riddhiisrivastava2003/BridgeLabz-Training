import java.io.*;
import java.util.*;

public class EmployeeSerialization implements Serializable{

    private int id;
    private String name;
    private String dept;
    private double salary;


    public EmployeeSerialization(int id, String name, String dept, double salary){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;


    }

    public String toString(){
        return "id: "+id+" | name: "+name+" | department: "+dept+" | salary: "+salary;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        ArrayList<EmployeeSerialization> list=new ArrayList<>();
        System.out.print("no. of employees: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("enter employee "+(i+1)+" details: ");
            System.out.print("id: ");
            int id=sc.nextInt();    
            sc.nextLine();
            System.out.print("name: ");
            String name=sc.nextLine();
            System.out.print("department: ");
            String dept=sc.nextLine();
            System.out.print("salary: ");
            double salary=sc.nextDouble();
            sc.nextLine();

            EmployeeSerialization emp=new EmployeeSerialization(id,name,dept,salary);
            list.add(emp);
        } 
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employees.dat"))){
            oos.writeObject(list);
            System.out.println("employees saved successfully");
        }
        catch(IOException e){
            System.out.println("error "+e.getMessage());
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employees.dat"))){
            ArrayList<EmployeeSerialization> empList=(ArrayList<EmployeeSerialization>)ois.readObject();
            System.out.println("employees read from file: ");
            for(EmployeeSerialization emp:empList){
                System.out.println(emp);
            }
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("error "+e.getMessage());
        }
        sc.close();
    



        
    }

}