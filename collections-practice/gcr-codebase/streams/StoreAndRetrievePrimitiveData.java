import java.io.*;
import java.util.*;

public class StoreAndRetrievePrimitiveData{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String filename="student.dat";

        System.out.print("enter roll number: ");
        int roll=sc.nextInt();
        sc.nextLine();

        System.out.print("enter name: ");
        String name=sc.nextLine();

        System.out.print("enter gpa: ");
        double gpa=sc.nextDouble();

        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename))){
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("data saved successfully");
        }

        catch(IOException e){
            System.out.println("write error: "+e.getMessage());

        }

        try(DataInputStream dis =new DataInputStream(new FileInputStream(filename))){

            int r=dis.readInt();
            String n=dis.readUTF();
            double g=dis.readDouble();

            System.out.println("data read from file: ");
            System.out.println("roll number: "+r);
            System.out.println("name : "+n);
            System.out.println("gpa: "+g);




        }

        catch(IOException e){
            System.out.println("read error: "+e.getMessage());
        }
    }
}