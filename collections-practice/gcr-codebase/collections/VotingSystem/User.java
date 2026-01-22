import java.util.*;

public class User{
    private VoteService service;

    public User(VoteService service){
        this.service=service;
    }

    public void takeVotes(){
        Scanner sc=new Scanner(System.in);
        
        while(true){

            System.out.print("enter candidate name or type exit to quit: ");
            String candidate=sc.nextLine();
            if(candidate.equals("exit")){
                break;
            }
            service.vote(candidate);
        
        }
    }
}