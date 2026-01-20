public class Tab{
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