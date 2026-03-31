import java.util.*;
public class EduResultMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        
        System.out.print("Enter the number of district: ");
        int district= sc.nextInt();

        for(int i=1;i<=district;i++){
            System.out.print("district "+i);
            System.out.print("enter number of students: ");
            int count= sc.nextInt();

            sc.nextLine();

            for(int d=0;d<count;d++){
                System.out.print("enter id: ");
                int id= sc.nextInt();
                sc.nextLine();
                System.out.print("enter name: ");
                String name= sc.nextLine();
                System.out.print("enter marks: ");
                int marks= sc.nextInt();
                sc.nextLine();
                list.add(new Student(id,name,marks));
            }
        }

        MergeSort.mergeSort(list);

        System.out.println("----final state rank list----");
        int rank=1;
        for(Student s:list){
            System.out.println("rank"+rank++ +" : "+s);
            
        }
    }





    }
