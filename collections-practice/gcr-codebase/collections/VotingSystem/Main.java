public class Main{
    public static void main(String args[]){

        VoteService service=new VoteService();
        User user=new User(service);

        System.out.println("-----welcome to voting system-----");

        user.takeVotes();

        System.out.println();

        System.out.println("-----final results-----");

        service.showResults();
    }
}