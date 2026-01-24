import java.io.*;

public class PipedStream{

    public static void main(String args[]){
        try{
            PipedOutputStream out=new PipedOutputStream();
            PipedInputStream in=new PipedInputStream(out);

            Thread writer=new Thread(()->{
                String msg="hello world";
                try{
                    out.write(msg.getBytes());
                }catch(IOException e){
                    System.out.println("error writing to pipe "+e.getMessage());
                
                }

            });

            Thread reader=new Thread(()->{
               try{
                int data;
                while((data=in.read())!=-1){
                    System.out.print((char)data);
                }
                in.close();

               }catch(IOException e){
                System.out.println("error reading from pipe "+e.getMessage());
               }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();



        }
        catch(IOException | InterruptedException e){
            System.out.println("error "+e.getMessage());
        }
    
        }
    }
