public class VoteService{

    private VoteManager manager=new VoteManager();

    public void vote (String candidate){
        manager.addVote(candidate);
    }


    public void showResults(){
        manager.displayOriginalVotes();
        manager.displayVoteOrder();
        manager.displaySortedResult();
    }
}

