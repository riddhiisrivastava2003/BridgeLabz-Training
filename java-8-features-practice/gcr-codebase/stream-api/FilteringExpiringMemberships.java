import java.util.*;
import java.time.*;

public class FilteringExpiringMemberships{
    static class Member{

        String name;
        LocalDate expiryDate;

        Member(String name, LocalDate expiryDate){
            this.name=name;
            this.expiryDate=expiryDate;
        }

        public LocalDate getExpiryDate(){
            return expiryDate;
        }

        @Override

        public String toString(){
            return "Name: "+name+" | Expiry Date: "+expiryDate;
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        List<Member> members=new ArrayList<>();

        System.out.println("Enter number of members: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter member name: ");
            String name=sc.nextLine();

            System.out.println("Enter expiry date (YYYY-MM-DD): ");
            String expiryDateStr=sc.nextLine();
            LocalDate expiryDate=LocalDate.parse(expiryDateStr);

            members.add(new Member(name,expiryDate));
        }

        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);


        System.out.println("Members expiring within the next 30 days: ");
        members.stream()
        .filter(m->!m.getExpiryDate().isBefore(today)
        && !m.getExpiryDate().isAfter(next30Days))
        .forEach(System.out::println);


    }
}