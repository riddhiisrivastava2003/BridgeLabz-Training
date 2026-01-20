import java.util.*;

public class ExamProctor{

    static Stack<Integer> navigate=new Stack<>();

    static HashMap<Integer,String> answers=new HashMap<>();

    static HashMap<Integer,String> answerKey=new HashMap<>();


    public static int scoreCalculation(){
        int score=0;

        for(int questionId: answerKey.keySet()){
            if(answers.containsKey(questionId) && answers.get(questionId).equals(answerKey.get(questionId))){
                score++;
            }   
        }
        return score;
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);


        answerKey.put(1,"A");
        answerKey.put(2,"B");
        answerKey.put(3,"C");
        answerKey.put(4,"D");
        answerKey.put(5,"E");



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

                navigate.push(questionId);

                System.out.println("visited question: "+questionId);

            }
            else if (choice==2){

                System.out.println("enter question number(1-5)");
                int questionId=sc.nextInt();

                System.out.println("enter answer (A/B/C/D/E)");
                String ans=sc.next().toUpperCase();

                answers.put(questionId,ans);

                System.out.println("answer saved");



            }



            else if(choice==3){
                if(!navigate.isEmpty()){
                    System.out.println("went back from question: "+navigate.pop());
                }
                else{
                    System.out.println("no question to go back");

                }

            }

            else if(choice==4){
                int score=scoreCalculation();

                System.out.println("exam submitted");
                System.out.println("final score: "+score+"/"+answerKey.size());
                break;

            }

            else{
                System.out.println("invalid choice");
            }





            }


        }
    }


