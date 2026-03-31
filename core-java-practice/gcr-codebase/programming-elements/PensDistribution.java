import java.util.*;
 public class PensDistribution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pens=14;
        int students=3;
        int studentsGetPen=14/3;
        int pensLeft=14%3;
        System.out.println("The Pen per students is "+studentsGetPen+ " and the remaining pen not distributed is "+pensLeft);
    }
 }