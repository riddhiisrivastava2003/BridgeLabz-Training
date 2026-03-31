import java.util.*;

public class SuppressedWarningUnchecked{

    @SuppressWarnings("unchecked")

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        ArrayList list=new ArrayList();

        System.out.println("enter the number of elements to add: ");
        int n=sc.nextInt();

        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            System.out.println("enter element "+(i+1)+" : ");
            String input=sc.nextLine();

            try{

                list.add(Integer.parseInt(input));
            }
            catch(NumberFormatException e){
                try{
                    list.add(Double.parseDouble(input));
                }
                catch(NumberFormatException e1){
                    list.add(input);    
                }

            }
           
        }

        System.out.println("contents of the list: ");
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}