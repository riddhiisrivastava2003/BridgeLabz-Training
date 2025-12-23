import java.util.*;
public class RockPaperScissorsGame{

    static String choiceOfComputer(){
        String[] choice={"Rock","Paper","Scissors"};
        return choice[(int) (Math.random()*3)];
        }

        static String winner(String user,String computer){
            if(user.equals(computer)) return "Draw";
            else if((user.equals("Rock")&& computer.equals("Scissors"))|| (user.equals("Paper")&& computer.equals("Rock"))||(user.equals("Scissors")&& computer.equals("Paper")))
                return "User";
         return "Computer";   
        }

        static String[][] calculatingStats(int userWins, int games,int computerWins){
            double userPerc=(userWins*100.0)/games;
            double computerPerc=(computerWins*100.0)/games;

            return new String[][]{
                {"User", String.valueOf(userWins),String.format("%.2f%%",userPerc)},
                {"Computer",String.valueOf(computerWins),String.format("%.2f%%",computerPerc)}
            
            };
        }

        static void displayResults(String[][] games,String[][] stats){
            System.out.println("\nGame\tUser\tComputer\tWinner");
            for(int i=0;i<games.length;i++)
                System.out.println((i+1)+"\t"+games[i][0]+"\t\t"+games[i][2]);

                System.out.println("\nPlayer\tWins\tWin");
                for(String[] row:stats)
                    System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]);

            
        }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("number of games");
            int n=sc.nextInt();

            String[][] gamesResult=new String[n][3];
            int userWins=0,computerWins=0;

            String[] choices={"rock","Paper","Scissors"};
            for(int i=0;i<n;i++){
                String user=choices[(int)(Math.random()*3)];

                String computer=choiceOfComputer();
                String win=winner(user, computer);
                if(win.equals("User")) userWins++;
                if(win.equals("Computer")) computerWins++;

                gamesResult[i]=new String[]{user,computer,win};

            }

            String[][] stats=calculatingStats(userWins, computerWins,n);
            displayResults(gamesResult, stats);
        }


}