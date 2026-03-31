import java.util.*;

public class FileSchedulerMain{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BackUpScheduler scheduler=new BackUpScheduler();


        while(true){

            System.out.println("----file backup scheduler----");
            System.out.println("1. add backup task");
            System.out.println("2. execute next task");
            System.out.println("3. show all tasks");
            System.out.println("4. exit");
            System.out.print("enter your choice: ");

            int choice=sc.nextInt();
            sc.nextLine();

            try{
                switch(choice){
                    case 1:
                        System.out.print("enter backup path: ");
                        String path=sc.nextLine();
                        System.out.print("enter backup priority: ");
                        int priority=sc.nextInt();

                        scheduler.addTask(path, priority);
                        break;
                    case 2:
                        scheduler.excecuteNextTask();
                        break;
                    case 3:
                        scheduler.showALlTasks();
                        break;
                    case 4:
                        System.out.println("exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }catch(InvalidBackUpPathException e){
                System.out.println(e.getMessage()); 
            }
        }


    }
}