import java.util.*;
public class Main{
    public static void main(String[] args) {
        OnlineExamService service=new OnlineExamService();
        Scanner sc=new Scanner(System.in);  

        while(true){
            try{
            System.out.println("1.create exam");
            System.out.println("2.add question");
            System.out.println("3.add student");
       
            System.out.println("4.take exam");
            System.out.println("5.show result");
          //  System.out.println("7.list exams");
            //System.out.println("8.list students");
            System.out.println("0.exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter exam title");
                    String title=sc.next();
                    service.createExam(title);
                    break;  

                    case 2:
                        service.listExams();
                    System.out.println("enter exam index");
                    int examIndex=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter question ");
                    String q=sc.nextLine();
                    System.out.println("enter question answer");
                    String answer=sc.next();
                    System.out.println("enter question marks");
                    int marks=sc.nextInt();
                    service.addQuestion(String.valueOf(examIndex),q,answer,marks);
                    break;  
                    case 3:
                        System.out.println("enter student name");
                    String name=sc.next();
                    service.addStudent(name);
                    break;
                    case 4:
                       service.listStudents();
                       System.out.println("student index");
                       int si=sc.nextInt();
                       service.listExams();
                       System.out.println("exam index");
                       int ei=sc.nextInt();
                       sc.nextLine();

                       System.out.println("1. objective evaluation");
                       System.out.println("2. descriptive evaluation");
                       int mode=sc.nextInt();
                       service.setMode(mode);
                       service.takeExam(si, ei);
                       break;
                       
                case 5:
                   service.listStudents();
                   System.out.println("enter student index");
                   int index=sc.nextInt();
                   service.showResult(index);
                   break;
                  case 0:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("invalid choice");
                    break;
            }
        }catch(Exception e){
            System.out.println("invalid input");
            sc.nextLine();
        }
    
        }
                            
        }
    }
