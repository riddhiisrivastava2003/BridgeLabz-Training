import java.util.*;

class Node{
    String page;
    Node next,prev;

    Node(String page){
        this.page=page;
        // this.next=next;
        // this.prev=prev;
    }



}


class Tab{
    Node current;

    public void visitPage(String page){
        Node newNode=new Node(page);

        if(current !=null){
            current.next=newNode;
            newNode.prev=current;
        
        }

        current=newNode;
        System.out.println("visited page: "+page);

    }


    public void goback(){
        if(current !=null &&current.prev!=null){
            current=current.prev;
            System.out.println("went back to page: "+current.page);
        }
        else{
            System.out.println("no pages to go back");
        
        }
    }


    public void goforward(){
        if(current !=null &&current.next!=null){
            current=current.next;
            System.out.println("forwarded to: "+current.page);
            }
        else{
            System.out.println("no pages to go forward");
        
        }

    }


    public String currentPage(){
        return current !=null ? current.page :"empty tab";
    }




}

public class BrowserBuddy{
    static Stack<Tab> closedTabs=new Stack<>();

    static Tab currentTab=new Tab();

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("browser buddy");
            System.out.println("1. visit page");
            System.out.println("2. go back");
            System.out.println("3. go forward");
            System.out.println("4. close tab");
            System.out.println("5. restore closed tab");
            System.out.println("6. current page");
            System.out.println("7. exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("enter page to visit: ");
                    String page=sc.nextLine();
                    currentTab.visitPage(page);
                    break;


                    case 2:
                        currentTab.goback();
                        break;

                        case 3:
                            currentTab.goforward();
                            break;

                            case 4:
                                closedTabs.push(currentTab);
                                currentTab=new Tab();
                                System.out.println("tab closed");
                                break;

                                case 5:
                                    if(!closedTabs.isEmpty()){
                                        currentTab=closedTabs.pop();
                                        System.out.println("restored tab");
                                    }
                                    else{
                                        System.out.println("no closed tabs");
                                    }
                                    
                                    break;

                                    case 6:
                                        System.out.println("current page: "+currentTab.currentPage());
                                        break;

                                        case 7:
                                            System.out.println("exiting");
                                            System.exit(0);
                                            break;

                                            default:
                                                System.out.println("invalid choice");
                                                break;

            }


        }
    }
}