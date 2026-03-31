import java.util.*;

public class ReverseQueue{

    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
        return;

    }

    int front =queue.remove();

    reverseQueue(queue);

    queue.add(front);


}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> queue = new LinkedList<>();

    System.out.println("enter number of elements: ");
    int n = sc.nextInt();
    System.out.println("enter elements: ");
    for(int i=0; i<n; i++){
        queue.add(sc.nextInt());
    }

    System.out.println("original queue "+queue);
    reverseQueue(queue);
    System.out.println("reversed queue "+queue);
}


}