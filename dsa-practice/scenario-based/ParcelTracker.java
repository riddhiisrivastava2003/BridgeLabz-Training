import java.util.*;

class Node{
    String stage;
    Node next;

    Node(String stage){
        this.stage=stage;
        this.next=null;
    }
}

class Parcel{

    Node head;

    public void defaultStage(){
        head=new Node("packed");
        head.next=new Node("shipped");
        head.next.next=new Node("in transit");
        head.next.next.next=new Node("delivered");
    }


    public void track(){
        if(head==null){
            System.out.println("no tracking available..parcel lost");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.stage);
            if(temp.next!=null) System.out.print(" -> ");
            temp=temp.next;
        }
        System.out.println();
    
    }



    public void addCheckPoint(String afterStage,String newStage){
        Node temp=head;

        while(temp!=null && !temp.stage.equalsIgnoreCase(afterStage)){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("invalid stage");
            return;
        }

        Node newNode=new Node(newStage);
        newNode.next=temp.next;
        temp.next=newNode;

        System.out.println("check point added");

        }



        public void markLost(){
            if(head !=null){
                head=null;
                System.out.println("parcel lost");
            }

            }
        }
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
