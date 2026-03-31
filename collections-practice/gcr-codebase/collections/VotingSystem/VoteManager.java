import java.util.*;

public class VoteManager{

    private HashMap<String, Integer> votes= new HashMap<>();
    private LinkedHashMap<String , Integer> voteOrder= new LinkedHashMap<>();

    public void addVote(String candidate){
        votes.put(candidate, votes.getOrDefault(candidate,0)+1);
        voteOrder.put(candidate,votes.get(candidate));

    }

     public void displayOriginalVotes(){
        System.out.println("original votes: "+votes);
    // votes.forEach((k,v)->System.out.println(k+" -> "+v));
     }



    public void displayVoteOrder(){
        // System.out.println("votes in order: ");
        // voteOrder.forEach(k,v)->System.out.println(k+" -> "+v);

        System.out.println("votes in order: "+voteOrder);

    
    }


    public void displaySortedResult(){
        TreeMap<String,Integer> sorted=new TreeMap<>(votes);
            System.out.println("sorted votes: "+sorted);

           // sorted.forEach((k,v)->System.out.println(k+" -> "+v));
        };


    }

   
        
    
