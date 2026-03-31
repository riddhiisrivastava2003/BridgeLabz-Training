import java.io.*;
import java.util.*;

public class BufferedVsUnbufferedCopy{

    private static final int BUFFER_SIZE=4096;

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter source file: ");
        String sourceFile=sc.nextLine();

        System.out.print("enter destination file: ");
        String destFile=sc.nextLine();

        System.out.print("enter destination file buffered copy: ");
        String destFileBuffered=sc.nextLine();

        long normalTime=copyFile(sourceFile,destFile);
        long bufferedTime=copyFileBuffered(sourceFile,destFileBuffered);


        System.out.println("normal copy time: "+normalTime+"ns");
        System.out.println("buffered copy time: "+bufferedTime+"ns");

        if(normalTime>bufferedTime){
            System.out.println("buffered copy is faster by "+(normalTime-bufferedTime)+"ns");
        }
        else{
            System.out.println("normal copy is faster by "+(bufferedTime-normalTime)+"ns");
        }
        sc.close();
    }

    private static long copyFile(String sourceFile,String destFile){
        long startTime=System.nanoTime();

        try(FileInputStream fis=new FileInputStream(sourceFile);
        FileOutputStream fos=new FileOutputStream(destFile)){
            byte[] buffer=new byte[BUFFER_SIZE];
            int bytesRead;

            while((bytesRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }

        }
        catch(IOException e){
            System.out.println("error "+e.getMessage());
        }
        return System.nanoTime()-startTime;
    }


    private static long copyFileBuffered(String sourceFile,String destFile){
        long startTime=System.nanoTime();

        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile))){
                byte[] buffer=new byte[BUFFER_SIZE];
                int bytesRead;

                while((bytesRead=bis.read(buffer))!=-1){
                    bos.write(buffer,0,bytesRead);
                }
                
            }
            catch(IOException e){
                System.out.print("error: "+e.getMessage());
            }
            return System.nanoTime()-startTime;

        }

    }