import java.util.*;

class StackQueues{
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public void push(int x){
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;

        System.out.println(q1);
    }

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.remove();
    
    }

        public int top(){
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.peek();
            }

            public void display(){
                System.out.println(q1);
            }



        }


        public class StackUsingQueues{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                StackQueues stack = new StackQueues();
                while(true){
                    System.out.println("1. push");
                    System.out.println("2. pop");
                    System.out.println("3. top");
                    System.out.println("4. display");
                    System.out.println("5. exit");
                    System.out.println("enter your choice: ");  

                    int n=sc.nextInt();
                    switch(n){
                        case 1:
                            System.out.println("enter element to push: ");
                            int x=sc.nextInt();
                            stack.push(x);
                            break;
                        case 2:
                            stack.pop();
                            break;
                        case 3:
                            stack.top();
                            break;
                        case 4:
                            stack.display();
                            break;
                        case 5:
                            System.exit(0);

                    }
                }
            }
        }

