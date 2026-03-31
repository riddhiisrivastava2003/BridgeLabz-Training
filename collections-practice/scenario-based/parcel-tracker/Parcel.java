import java.util.*;
public class Parcel{

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