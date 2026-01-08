class StudentNode{
int rollNo;
String name;
int age;
char grade;
StudentNode next;

    public StudentNode(int rollNo, String name, int age, char grade, Node next) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    
}
public class StudentRecordSingleLinkedList{
    StudentNode head;
    public void insertAtEnd(int rollNo,int age,String name,char grade){
        StudentNode newNode = new StudentNode(rollNo, name, age, grade, null);
        if(head == null){
            head = newNode;
            return;
        }else{


            
           StudentNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtBegining(int rollNo, int age, String name,char grade){
        this.head = new StudentNode(rollNo,name,age,grade,null);
    }


    public void insertAtSpecificPosition(int rollNo, int age, String name,char grade){
        StudentNode node = new StudentNode(rollNo,name,age,grade,null);
        if(head == null){
            head = node;
        }
        else{
           StudentNode current = head;
            int count = 1;
            while(current.next != null && count < 2){
                current = current.next;
                count++;
            }
            current.next = node;
        }
    }

    public void deleteByRoll(int rollNo){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            return;
        }
        StudentNode current = head;
        StudentNode previous = null;
     
        while(current != null && current.rollNo != rollNo){
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Record not found");
            return;
        }
        previous.next = current.next;
    }

    // public Node searchByRoll(int rollNo){
    //     Node current = head;
    //     if(head == null){
    //         System.out.println("Not found");
    //         return null;
    //     }
    //     if(head.rollNo == rollNo){
    //         head= head.next;
    //         return current;
            
    //     }
    //     else{
    //         while(current != null && current.rollNo != rollNo){
    //             current= current.next;
    //         }
    //         if(current==null){
    //              System.out.println("Not found");
    //              return null;
    //             }
    //         return current;
    //     }
    // }


    public StudentNode searchByRoll(int rollNo){
   StudentNode current = head;
    while(current != null){
        if(current.rollNo == rollNo){
            return current;
        }
        current = current.next;
    }
    System.out.println("Not found");
    return null;
}

    public void updateGradeByRoll(int rollNo,char grade){
       StudentNode current = head;
        if(head == null){
            System.out.println("Not Found");
            return;
        }
        if(head.rollNo == rollNo){
            head.grade = 'A';
        }
        else{
            while(current != null && current.rollNo != rollNo){
                current = current.next;
            }
            if(current == null){
                System.out.println("Not Found");
                return;
            }
            current.grade = 'A';
        }
    }         

    public void displayRecords(){
        StudentNode current = head;
        while(current != null){
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        StudentRecordSingleLinkedList obj = new StudentRecordSingleLinkedList();
        obj.insertAtBegining( 23,18,"rishabh",'A');
        obj.insertAtSpecificPosition(15, 19, "Akash", 'C');
        obj.insertAtEnd(87, 12, "Willams", 'B');
        obj.displayRecords();
        System.out.println();
        obj.deleteByRoll(15);
        obj.displayRecords();
        StudentNode record = obj.searchByRoll(23);
        if (record!=null)
            System.out.println("Name : " + record.name + " , Age : " +record.age + " , Grade : " + record.grade);

    }
}