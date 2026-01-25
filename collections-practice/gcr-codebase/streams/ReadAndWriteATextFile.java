import java.io.*;
import java.util.*;

public class  ReadAndWriteATextFile{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter source file: ");
        String sourceFile=sc.nextLine();

        System.out.print("enter destination file: ");
        String destFile=sc.nextLine();

        FileInputStream fis=null;
        FileOutputStream fos=null;

         try{
            File srcFile=new File(sourceFile);
            
            if(!srcFile.exists()){
                System.out.println("source file does not exist");
                return;
         }

         fis=new FileInputStream(srcFile);
         fos=new FileOutputStream(destFile);

         int data;
         while((data=fis.read())!=-1){
            fos.write(data);
         }
         System.out.println("file copied successfully");
         }catch(IOException e){
            System.out.println("error "+e.getMessage());
         }finally{
            try{
                if(fis!=null){
                    fis.close();
                }
                if(fos!=null){
                    fos.close();
                }
            }
            catch(IOException e){
                System.out.println("error "+e.getMessage());
            }
         }
        sc.close();
    }


    }

