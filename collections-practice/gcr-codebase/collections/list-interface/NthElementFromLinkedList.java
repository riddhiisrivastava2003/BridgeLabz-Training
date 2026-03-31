import java.util.*;

public class NthElementFromLinkedList{

    public static String findnthElementFromEnd(LinkedList<String >list,int n){
        Iterator<String> fast=list.iterator();
        Iterator<String> slow=list.iterator();

        for(int i=0;i<n;i++){

            if(!fast.hasNext()){

                return "n is larger than the list size";
            }

            fast.next();
        }


        while(fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        LinkedList<String > list=new LinkedList<>();

        System.out.println("enter number of elements: ");
        int n=sc.nextInt();

        sc.nextLine();

        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){

            list.add(sc.nextLine());


        }


        System.out.println("enter n(position from end): ");
        int pos=sc.nextInt();
        String result=findnthElementFromEnd(list,pos);

        System.out.println("nth element from end: "+result);
    }
}