import java.util.*;
class Handshakes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int handshakes=(students*(students-1))/2;
        System.out.println("Total number of handshakes are "+handshakes);

    }
}