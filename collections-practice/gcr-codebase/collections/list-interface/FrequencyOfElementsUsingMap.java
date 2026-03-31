import java.util.*;

public class FrequencyOfElementsUsingMap{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=sc.nextInt();

        sc.nextLine();

        List<String> list=new ArrayList<>();

        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }

        Map<String, Integer> frequencyMapping=countingFrequency(list);

        System.out.println("frequency of elements: "+frequencyMapping);

    }

    public static Map<String, Integer> countingFrequency(List<String> list){
        Map<String,Integer> freq=new HashMap<>();


        for(String str:list){
            freq.put(str,freq.getOrDefault(str,0)+1);
        }

        return freq;
    }
}