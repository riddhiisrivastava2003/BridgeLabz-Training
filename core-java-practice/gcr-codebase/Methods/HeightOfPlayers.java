import java.util.Random;
public class HeightOfPlayers {

	
	public static int findSum(int[] heights ) {

		int sum = 0 ; 

		for(int i: heights) {
			
			sum += i;
		}
		return sum;
	}

	public static double findMean(int[] heights) {
		int sum = findSum(heights);
		return (double) sum / heights.length;
	}
	

	public static int findShortest(int[] heights) {
		int shortest = heights[0];
		for(int height: heights) {
			
			if(height<shortest ) {

				shortest = height;
			}
		}return shortest;
	}
	

	public static int findTallest(int[] heights) {
		int tallest = heights[0];
		for(int height : heights){
			if(height > tallest ){
				tallest = height ;
			}
		}return tallest;
	}

	public static void main(String[] args) {
		

		int[] heights = new int[11];
		Random random = new Random();
				
		System.out.println("Height  players  ");
		for(int i = 0 ; i< heights.length ; i++) {
			heights[i] = 150 + random.nextInt(101) ;
			System.out.println(heights[i] + " ");
		}
		System.out.println();

		int sum = findSum(heights);
		double mean = findMean(heights);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);
	
		System.out.println("\ntotal height of players: " + sum + " cms");
		System.out.println("mean height of players : " + mean + " cms ");
		System.out.println("shortest  player is " + shortest + "cms");
		System.out.println("tallest player is " + tallest + " cms ");

	}

}
