import java.util.*;

public class ExamMenu{

    private ExamSession session=new ExamSession();
    private Scanner sc=new Scanner(System.in);

     public void start(){

        while(true){

            System.out.println("exam proctor system");

            System.out.println("1. visit question");
            System.out.println("2. answer question");
            System.out.println("3. go back");
            System.out.println("4. submit exam");
            System.out.println("5. exit");


            int choice=sc.nextInt();


            if(choice==1){

                System.out.println("enter question number(1-5)");
                int questionId=sc.nextInt();

                //navigate.push(questionId);
                session.visitQuestion(questionId);


                System.out.println("visited question: "+questionId);

            }
            else if (choice==2){

                System.out.println("enter question number(1-5)");
                int questionId=sc.nextInt();

                System.out.println("enter answer (A/B/C/D/E)");
                String ans=sc.next().toUpperCase();

                // answers.put(questionId,ans);
                

                System.out.println("answer saved");
                



            }



            else if(choice==3){
                    // if(!navigate.isEmpty()){
                    //     System.out.println("went back from question: "+navigate.pop());
                    // }
                    // else{
                    //     System.out.println("no question to go back");

                    // }    
                    session.goBack();
                    


            }

            else if(choice==4){
                int score=session.scoreCalculation();

                System.out.println("exam submitted");
                System.out.println("final score: "+score+"/"+session.totalQuestions());
                

            }

            else if(choice==5){
                System.out.println("exiting");
                break;
            }
             else{
                System.out.println("invalid choice");
            }

            }

           





            }


        }
    
