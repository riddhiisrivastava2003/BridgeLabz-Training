
import java.util.*;

class Node{

    int key ; 
    int value;
    Node next;

    Node(int key , int value){

        this.key = key;
        this.value = value;
        this.next = null;
    }

}

class CustomHashMap{
    private int size = 10;
    private Node[] table;

    public CustomHashMap(){

        table = new Node[size];

    }



    private int hash(int key){
        return key % size;

    }



    public void put(int key , int value){

        int index = hash(key);
        Node head = table[index];

        Node current = head ; 
        while(current != null){

            if (current.key == key) {

                current.value =value; 
                System.out.println("key updated");
                return;
            }
            current = current.next;
        }

        

    
    Node newNode =new Node(key,value);
    newNode.next =head;
    table[index] =newNode;
    System.out.println("key inserted");

        

}
    

  
    public Integer get(int key){

        int index = hash(key);
        Node current = table[index];


        while(current !=null){

            if(current.key ==key){
                return current.value;

            } 
            
        }
        return null;

    }



    public void remove(int key){
            int index =hash(key);

            Node current =table[index];
            Node prev =null;

            while(current != null){
                if(current.key == key){

                    if(prev == null){

                        table[index] =current.next;

                    }else{

                        prev.next = current.next;
                    }
                    System.out.println("key deleted");
                    return;
                }
                prev = current ;
                current =current.next;
            }


            System.out.println("key not found");
        }


        public void display(){

            for(int i=0; i<size;i++){

                System.out.println("index " +i+":");
                Node current =table[i];


                while(current!=null){
                    System.out.println("key: "+current.key+", value: "+current.value);

                    current = current.next;
                }
                System.out.println("null");
            }
        }
    } 
        

public class CustomHashMapQuestion{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

            CustomHashMap map = new CustomHashMap();

             while (true) {
            System.out.println("1. put key (Put)");
            System.out.println("2. get key (Get)");
            System.out.println("3. delete key");
            System.out.println("4. display HashMap");
            System.out.println("5. exit");

            System.out.print("enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter key: ");
                    int key = sc.nextInt();

                    System.out.print("enter value: ");
                    int value = sc.nextInt();

                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("enter key to retrieve: ");
                    key = sc.nextInt();

                    Integer result = map.get(key);

                    if (result != null){
                        System.out.println("value: " +result);}

                    else{
                        System.out.println("key not found");}
                    break;



                case 3:
                    System.out.print("enter key to remove: ");
                    key = sc.nextInt();


                    map.remove(key);
                    break;

                case 4:

                    map.display();
                    break;

                case 5:
                    System.out.println("exiting......");
                    sc.close();

                    return;

                default:
                    System.out.println("invalid choice");
            }

        }
    }  
}

