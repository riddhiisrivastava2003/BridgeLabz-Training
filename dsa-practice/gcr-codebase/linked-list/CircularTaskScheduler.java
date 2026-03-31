import java.util.Scanner;

class Task{
    int taskID;
    String taskName;
    int priority;


    String dueDate;
    Task next;

    public Task(int taskID, String taskName, int priority, String dueDate){
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
    


    




}
class TaskScheduler{
    private Task head = null;
    private Task current = null;


    public void addAtBeginning(Task newTask){
        if(head == null){
            head = newTask;
            newTask.next = head;
            current = head;

        }else {
            Task temp = head;
            while (temp.next != head)
                temp = temp.next;

            newTask.next = head;
            temp.next = newTask;
            head = newTask;

            
        }
        System.out.println("task added at beginning: ");
    }
 
    public void addAtEnd(Task newTask){


        
        if(head == null){
            head = newTask;
            newTask.next = head;
            current = head;
            
        }else{
            Task temp = head;
            while(temp.next != head)
                temp = temp.next;
            temp.next = newTask;
            newTask.next = head;


        }
        System.out.println("task added at end");
    }

    public void addAtPosition(Task newTask , int position){
        if(position <= 11 || head == null){
            addAtBeginning(newTask);
            return;

        }



        Task temp = head;
        int count = 1;
        while(count < position - 1 && temp.next != head){
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
        System.out.println("task added at postion : " + position);

    }



   
    public void removeTask(int taskID){
        if(head == null){
            System.out.println("no task to remove");
            return;
        }
        Task curr = head , prev = null;

        do { 
            if(curr.taskID == taskID){
                if(curr == head && curr.next == head ){
                    head = null;
                    curr = null;

                }else{
                    if(curr == head){
                        Task last = head;
                        while(last.next != head)
                            last = last.next;
                        head = head.next;
                        last.next = head;

                    }else{
                        prev.next = curr.next;
                    }
                }
                System.out.println("task removed successfully");
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);
        System.out.println("task id not found");
    }
  
    public void viewCurrentTask(){
        if(current == null){
            System.out.println("no Task available");
            return;
        }
        System.out.println("\ncurrent task: ");
        displayTask(current);
        current = current.next;

    }

    public void displayAllTasks(){
        if(head == null){
            System.out.println("no task scheduled");
            return;
        }

        Task temp = head;
        System.out.println("\ntask list");
        do{
            displayTask(temp);
            temp = temp.next;

        }while (temp != head);
            
        
    }

    public void searchByPriority(int priority){
        if(head == null){
            System.out.println("no task available");
            return;
        }
        Task temp = head;
        boolean found = false;
        do{
            if(temp.priority == priority){
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        }while(temp!= head);

        if(!found)
            System.out.println("no task found with priority " + priority);
    }

    private void displayTask(Task t) {
        System.out.println("task ID: " + t.taskID);
        System.out.println("task name: " + t.taskName);
        System.out.println("priority: " + t.priority);
        System.out.println("due date: " + t.dueDate);
        
    }


}


public class CircularTaskScheduler{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler =new TaskScheduler();
        while (true) { 
            System.out.println("\n=== Task Scheduler Menu ===");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("task name: ");
                    String name = sc.nextLine();
                    System.out.print("priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("due date: ");
                    String date = sc.nextLine();

                    Task task = new Task(id, name, priority, date);

                    if (choice == 1)
                        scheduler.addAtBeginning(task);
                    else if (choice == 2)
                        scheduler.addAtEnd(task);
                    else {
                        System.out.print("enter position: ");
                        int pos = sc.nextInt();
                        scheduler.addAtPosition(task, pos);
                    }
                    break;

                case 4:
                    System.out.print("rnter task ID to remove: ");
                    scheduler.removeTask(sc.nextInt());
                    break;

                case 5:
                    scheduler.viewCurrentTask();
                    break;

                case 6:
                    scheduler.displayAllTasks();
                    break;

                case 7:
                    System.out.print("enter priority: ");
                    scheduler.searchByPriority(sc.nextInt());
                    break;

                case 8:
                    System.out.println("exiting task scheduler...");
                    sc.close();
                    return;

                default:
                    System.out.println("invalid choice!");
            }
            
        }
    }
}