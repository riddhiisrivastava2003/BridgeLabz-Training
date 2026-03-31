import java.util.*;
public class TransformingNameToDisplay{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<String> names=new ArrayList<>();

        System.out.println("Enter number of names: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            names.add(name);

    }

    System.out.println("Transformed Names: ");
    names.stream()
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
}
}