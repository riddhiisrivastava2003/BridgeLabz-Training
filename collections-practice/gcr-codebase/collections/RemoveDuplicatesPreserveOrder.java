import java.util.*;
public class RemoveDuplicatesPreserveOrder{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter number of elements");
        int n=sc.nextInt();

        List<Integer> list=new ArrayList<>();

        System.out.println("enter elements");

      
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }




        Set<Integer> set=new LinkedHashSet<>(list);
        List<Integer> result=new ArrayList<>(set);

        System.out.println("list after removing duplicates: ");
        System.out.println(result);
    }

}