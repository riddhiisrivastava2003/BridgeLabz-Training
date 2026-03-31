import java.util.*;

public class  SearchForATargetValueInA2DSortedMatrix{


    public static boolean searchMatrix(int[][] matrix,int target){

        int rows=matrix.length;
        int cols=matrix[0].length;

        int left=0;
        int right=rows*cols-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            int midValue=matrix[mid/cols][mid%cols];

            if(midValue==target){
                return true;
            }

            else if(midValue<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of rows: ");
        int r=sc.nextInt();

        System.out.println("enter number of columns: ");
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];

        System.out.println("enter sorted matrix elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        System.out.println("enter target value: ");
        int target=sc.nextInt();

        boolean found=searchMatrix(matrix,target);

        if(found){
            System.out.println("target value found");
        }
        else{
            System.out.println("target value not found");

        }



    }
}
