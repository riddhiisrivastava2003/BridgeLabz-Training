

import java.util.*;


public class SnakeAndLadder {
	
	static final int NO_PLAY=0;
	static final int LADDER=1;
	static final int SNAKE=2;
	static final int WINNING_POSITION=100;
	
	
	static Random random =new Random();
	static Scanner sc=new Scanner(System.in);
	
	//use case 2 dice roll karwana h 
	public static int diceRoll() {
		//System.out.println("use case 1 dice roll");
		return random.nextInt(6)+1;
	}
	
	//use case 3 option milega ki no play karna h ladder lena h snake h ya nhi
	public static int getOption() {
	//	System.out.println("use case 3 getting the option no play, ladder or snake");
		return random.nextInt(3);
		
		
	}
	//updation of position
	
	public static int gettingNewPosition(int pos,int dice,int option) {
		int previousPosition=pos;
		
		switch(option) {
		case LADDER:
			pos=pos+dice;
			break;
		case SNAKE:
			pos=pos-dice;
			break;
		case NO_PLAY:
			break;
			default:
				break;//koi change nahi hoga;
				
		}
		
		//uc4 agar position <0 restart kar do 0 se
		
		if(pos<0) {
			pos=0;
		}
		//uc5 exact winning position
		if(pos>WINNING_POSITION) {
			pos=previousPosition;
		}
		return pos;
		
	}

	
	
	public static boolean playerTurn(String name,int[] position,int index,int[] diceCount) {
		System.out.println("\n" +name+" press ENTER to roll the dice!");
		sc.nextLine();
		
		int die=diceRoll();
		int option=getOption();
		
		diceCount[index]++;
		
		System.out.println(name+" rolled "+die);
		position[index]=gettingNewPosition(position[index],die,option);
		switch(option) {
		case NO_PLAY:
			System.out.println("Option: No Play");
			break;
		case LADDER:
			System.out.println("Option: Ladder");
			break;
		case SNAKE:
			System.out.println("Option: Snake");
			break;
			
		}
		
		
		
		System.out.println(name+" position "+position[index]);
		
		return option==LADDER;
		
		
		
		
	}
	//game start ho rha h 
	
	public static void startGame() {
		
		System.out.println("choose mode");
		System.out.println("1. Single player");
		System.out.println("2. Duo Player");
		
		int mode=sc.nextInt();
		sc.nextLine();
		
		String[] player;
		int[] position;
		int[] diceCount;
		
		if(mode==1) {
			System.out.println("enter player name");
			player=new String[] {sc.nextLine()};
			position=new int[] {0};
			diceCount=new int[] {0};
			
			System.out.println("\n the game has started(single player)");
			
			while(position[0]<WINNING_POSITION) {
				playerTurn(player[0],position,0,diceCount);
				
			}
			
			System.out.println("\n"+player[0]+" WON!");
			System.out.println("total dice roll "+diceCount[0]);
			
		}
		else {
			
			//two player
			
			System.out.println("enter player 1 name");
			String p1=sc.nextLine();
			System.out.println("enter player 2 name");
			String p2=sc.nextLine();
			
			player=new String[] {p1,p2};
			position=new int[] {0,0};
			
			diceCount=new int[] {0,0};
			
			boolean playerOneTurn=true;
			
			
			System.out.println("the game has started(two players)");
			
			while(position[0]<WINNING_POSITION && position[1]<WINNING_POSITION) {
				
				if(playerOneTurn) {
					boolean extraTurn=playerTurn(player[0],position,0,diceCount);
					if(!extraTurn) { 
						playerOneTurn=false;}
					}
					else {
						boolean extraTurn=playerTurn(player[1],position,1,diceCount);
						if(!extraTurn) 
							playerOneTurn=true;
						
					}
					
					
				}
			//winner declare krre h 
				
				if(position[0]==WINNING_POSITION) {
					System.out.println("\n"+player[0]+" WON!");
					System.out.println("dice rolls: "+diceCount[0]);
					
				}
				else {
					System.out.println("\n"+player[1]+" WON!");
					System.out.println("dice rolls: "+diceCount[1]);
					
				}
				
			}
			
			
		}
		
		
	public static void main(String args[]) {
		startGame();
	}
	
	
	
	}
	
	
	
	
	

	


