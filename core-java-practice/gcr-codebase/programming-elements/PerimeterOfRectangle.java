import java.util.*;
class PerimeterOfRectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt(), breadth=sc.nextInt();
        System.out.println("Perimeter of Rectangle"+2*(length+breadth));
    }
}