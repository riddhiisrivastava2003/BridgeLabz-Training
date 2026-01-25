import java.util.*;


    public class ParcelTracker{

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            Parcel tracker=new Parcel();

            tracker.defaultStage();

            while(true){

                System.out.println("parcel tracker");
                System.out.println("1. track parcel");
                System.out.println("2. add check point");
                System.out.println("3. mark parcel lost");
                System.out.println("4. exit");

                int choice=sc.nextInt();
                sc.nextLine();

                if(choice==1){
                    tracker.track();
                }
                else if(choice==2){
                    System.out.print("enter existing stage: ");
                    String after=sc.nextLine();
                    // System.out.print("enter new stage: ");
                    // String newStage=sc.nextLine();

                    System.out.print("enter checkpoint name: ");
                    String newStage=sc.nextLine();

                    tracker.addCheckPoint(after,newStage);
                }
                else if(choice==3){
                    tracker.markLost();
                }
                else if(choice==4){
                    System.out.println("exiting");
                    break;
                }
                else{
                    System.out.println("invalid choice");
                }
                    



            }
        }
    }