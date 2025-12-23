import java.util.*;
public class CardsShuffleAndDistribution{

    static String[] deckInitial(){
        String[] suit={"hearts","diamonds","clubs","spades"};
        String[] rank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suit.length*rank.length];
        int k=0;
        for(String s:suit)
            for(String r:rank)
                deck[k++]=r+" of "+s;
        return deck;    

        
    }

    static void shuffle(String[] deck){
        int n=deck.length;

        for(int i=0;i<n;i++){
            int r=i+(int)(Math.random()*(n-i));
            String temp=deck[i];
            deck[i]=deck[r];
            deck[r]=temp;
        }
    }

    static String[][] distribute(String[] deck, int player,int card){
        if(player*card>deck.length) return null;

        String[][] result=new String[player][card];
        int k=0;
        for(int i=0;i<player;i++)
            for(int j=0;j<card;j++)
                result[i][j]=deck[k++];
        return result;    
    }

    static void display(String[][] players){
        for(int i=0;i<players.length;i++){
            System.out.println("player"+(i+1)+" ");
            for(String card:players[i])
                System.out.println(" "+card);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] deck=deckInitial();
        shuffle(deck);

        System.out.println("no. of players");
        int p=sc.nextInt();
        System.out.println("cards per player");
        int c=sc.nextInt();

        String[][] player=distribute(deck, p, c);
        if(player==null) System.out.println("distribution not possible");
        else display(player);
    }

}