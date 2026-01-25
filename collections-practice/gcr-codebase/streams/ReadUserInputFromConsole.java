import java.io.*;
public class ReadUserInputFromConsole{
    public static void main(String args[]){

    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    try{

        System.out.print("enter your name: ");
        String name=reader.readLine();

        System.out.print("enter your age: ");
        String age=reader.readLine();


        System.out.print("enter your course: ");
        String course=reader.readLine();


        FileWriter writer=new FileWriter("file.txt");

        writer.write("name: "+name+"\n");
        writer.write("age: "+age+"\n");
        writer.write("course: "+course+"\n");

        writer.close();

        System.out.println("data saved successfully");
    

    }
    catch(IOException e){
        System.out.println("error occurred: "+e.getMessage());
    }
}
}