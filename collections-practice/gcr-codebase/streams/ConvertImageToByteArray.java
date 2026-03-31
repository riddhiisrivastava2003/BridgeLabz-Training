import java.io.*;
import java.util.*;

public class ConvertImageToByteArray{

    public static void main(String args[]){
        String originalImage="input.jpg";
        String convertedImage="output.jpg";

        try{
            FileInputStream fis=new FileInputStream(originalImage);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();

            byte[] buffer=new byte[4096];
            int bytesRead;

            while((bytesRead=fis.read(buffer))!=-1){
                baos.write(buffer,0,bytesRead);
            }

            byte[] imageData=baos.toByteArray();

            fis.close();
            baos.close();

            System.out.println("image converted to byte array");

            ByteArrayInputStream bais=new ByteArrayInputStream(imageData);
            FileOutputStream fos=new FileOutputStream(convertedImage);

            while((bytesRead=bais.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);

            }

            bais.close();
            fos.close();

            System.out.println("byte array written back to image");

            boolean same=compareFiles(originalImage,convertedImage);

            if(same){
                System.out.println("verification successful");
            }

            else{
                System.out.println("files are different");
            }
        }

        catch(IOException e){
            System.out.println("error: "+e.getMessage());
        }
    }

    private static boolean compareFiles(String file1, String file2) throws IOException{
        try(FileInputStream f1=new FileInputStream(file1);
            FileInputStream f2=new FileInputStream(file2)){
                int b1,b2;

                while((b1=f1.read()) !=-1){
                    b2=f2.read();

                    if(b1 !=b2) return false;
                }
                return f2.read()==-1;
            }
    }
}