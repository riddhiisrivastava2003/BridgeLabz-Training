import java.util.*;
 public class ResumeMain{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        List<JobRole> allCandidates=new ArrayList<>();

        while(true){
            System.out.println("1. add software engineer");
            System.out.println("2. add data scientist");
            System.out.println("3. add product manager");
            System.out.println("4. screen resumes");
            System.out.println("5. exit");
            System.out.println("enter your choice");
            int choice=sc.nextInt();


            sc.nextLine();


            if(choice>=1 && choice<=3){
                System.out.println("enter candidate name");
                String candidateName=sc.nextLine();

                JobRole candidate=null;

                switch(choice){
                    case 1:
                        candidate=new SoftwareEngineer(candidateName);break;
                        case 2:
                            candidate=new DataScientist(candidateName);break;
                            case 3:
                                candidate=new ProductManager(candidateName);break;

                
            }

            Resume<JobRole> resume=new Resume<>(candidate);
            resume.resumeProcess();
            allCandidates.add(candidate);


        }

        else if(choice==4){
            ResumeScreening.screenResume(allCandidates);

    }

    else if(choice==5){
        System.out.println("exiting...");
        break;
    }
    else{
        System.out.println("invalid choice");
    }
}

    }

 }