class Node{


    String itemName;
    int itemId;
    int quantity;
    double price;
    Node next;



    public Node(String itemName, int itemId, int quantity, double price,Node next) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
    



    


}
public class InventoryManagement{
    Node head;

    public void insertAtEnd(String itemName, int itemId, int quantity, double price){
        Node newNode = new Node(itemName, itemId, quantity, price, null);
        if(head == null){
            head = newNode;



        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }


            current.next = newNode;
        }
    }



    public void insertAtBegining(String itemName, int itemId, int quantity, double price){
        this.head = new Node(itemName,itemId,quantity,price,null);
    }



    public void insertAtSpecificPosition(String itemName, int itemId, int quantity, double price){
        Node node = new Node(itemName, itemId, quantity, price,null);
        if(head == null){
            head = node;
        }


        else{
            Node current = head;
            int count = 1;
            while(current.next != null && count < 3){
                current = current.next;
                count++;
            }
            current.next = node;
        }


    }

    public void deleteByRoll(int itemId){

        if(head == null){
            System.out.println("list is empty");
            return;
        }


        if(head.itemId == itemId){
            head = head.next;
            return;
        }


        Node current = head;
        Node previous = null;
  
        while(current != null && current.itemId != itemId){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("record not found");
            return;
        }
        previous.next = current.next;
    }



    public Node searchById(int itemId){
        Node current = head;
        if(head == null){
            System.out.println("not found");
            return null;
        }
        if(head.itemId == itemId){
            head= head.next;
            return current;
            
        }
        else{
            while(current != null && current.itemId != itemId){
                current= current.next;
            }
            if(current==null){
                 System.out.println("not found");
                 return null;
                }
            return current;
        }
    }




    public Node searchByName(String itemName){
        Node current = head;
        if(head == null){


            System.out.println("not found");
            return null;
        }
        if(head.itemName.equals(itemName)){
            head= head.next;
            return current;
            
        }
        else{
            while(current != null && !current.itemName.equals(itemName)){
                current= current.next;
            }
            if(current==null){


                 System.out.println("not found");
                 return null;
                }
            return current;
        }
    }
    public void updateGradeById(int itemId){
        Node current = head;
        if(head == null){
            System.out.println("not found");
            return;
        }
        if(head.itemId == itemId){
            head.quantity += 5;
        }
        else{



            while(current != null && current.itemId != itemId){
                current = current.next;
            }
            if(current == null){


                System.out.println("not found");
                return;
            }
            current.quantity += 5;
        }
    }
    public double totalValue(){
        Node current = head;
        double res = 0.0;
        if(head == null){


            System.out.println("empty list");
        }
        if(current.next == null) return current.price * current.quantity;

        while(current!=null){


            res = res + (current.price * current.quantity);
            current = current.next;
        }


        return res;
    }
    
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }



        while(current != null){
            System.out.println("item name: " + current.itemName + ", item ID: " + current.itemId + ", quantity: " + current.quantity + ", price: " + current.price);
            current = current.next;
        }
    }
 


    public void sortByName(){
        if(head == null || head.next == null){
            return;
        }
        Node current = head;
        Node index = null;
        String tempName;
        int tempId, tempQuantity;
        double tempPrice;

        while(current != null){
            index = current.next;
            while(index != null){
                if(current.itemName.compareTo(index.itemName) > 0){
                   



                    tempName = current.itemName;
                    tempId = current.itemId;
                    tempQuantity = current.quantity;
                    tempPrice = current.price;

                    current.itemName = index.itemName;
                    current.itemId = index.itemId;
                    current.quantity = index.quantity;
                    current.price = index.price;

                    index.itemName = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
                index = index.next;
            }
            current = current.next;
        }
    }






    public void sortByPrice(){
        if(head == null || head.next == null){
            return;
        }
        Node current = head;
        Node index = null;
        String tempName;
        int tempId, tempQuantity;
        double tempPrice;



        while(current != null){
            index = current.next;
            while(index != null){
                if(current.price > index.price){
                    //swap
                    tempName = current.itemName;
                    tempId = current.itemId;
                    tempQuantity = current.quantity;
                    tempPrice = current.price;

                    current.itemName = index.itemName;
                    current.itemId = index.itemId;
                    current.quantity = index.quantity;
                    current.price = index.price;

                    index.itemName = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

   
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        inventory.insertAtEnd("Laptop", 101, 10, 750.50);
        inventory.insertAtEnd("Smartphone", 102, 20, 500.00);
        inventory.insertAtBegining("Tablet", 103, 15, 300.75);
        inventory.insertAtSpecificPosition("Headphones", 104, 25, 150.25);

        System.out.println("inventory list:");
        inventory.display();



        System.out.println("\ntotal inventory value: $" + inventory.totalValue());

        System.out.println("searching for item ID 102:");
        Node foundItem = inventory.searchById(102);
        if(foundItem != null){
            System.out.println("found item - name: " + foundItem.itemName + ", quantity: " + foundItem.quantity + ", price: " + foundItem.price);
        }



        System.out.println("\nupdating quantity for item ID 101:");
        inventory.updateGradeById(101);
        inventory.display();



        System.out.println("\nsorting inventory by name:");
        inventory.sortByName();
        inventory.display();



        System.out.println("\nsorting inventory by price:");
        inventory.sortByPrice();
        inventory.display();




        System.out.println("\ndeleting item ID 103:");
        inventory.deleteByRoll(103);
        inventory.display();
    }


}