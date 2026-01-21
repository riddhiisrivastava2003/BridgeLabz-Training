import java.util.*;

public class ReverseArrayListAndLinkedList{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements for arraylist");
        int n=sc.nextInt();

        ArrayList<Integer> arrayList=new ArrayList<>();

        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }

        ArrayList<Integer> reverseArrayList=reverseArrayList(arrayList);
        System.out.println("reverse arraylist "+reverseArrayList);


        System.out.println();

        System.out.println("enter number of elements for linkedlist");
        int m=sc.nextInt();

        LinkedList<Integer> linkedList=new LinkedList<>();

        System.out.println("enter elements");
        for(int i=0;i<m;i++){
            linkedList.add(sc.nextInt());
        }

        LinkedList<Integer> reverseLinkedList=reverseLinkedList(linkedList);
        System.out.println("reverse linkedlist "+reverseLinkedList);



       


    }

     public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList){
            ArrayList<Integer> reverse=new ArrayList<>();

            for(int i=arrayList.size()-1;i>=0;i--){
                reverse.add(arrayList.get(i));
            }
            return reverse;
        }


        public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList){
            LinkedList<Integer> reverse=new LinkedList<>();

            for(int i=linkedList.size()-1;i>=0;i--){
                reverse.add(linkedList.get(i));
            }
            return reverse;
        }


}