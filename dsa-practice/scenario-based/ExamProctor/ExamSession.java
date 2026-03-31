import java.util.*;

public class ExamSession{
     private Stack<Integer> navigate=new Stack<>();

    private HashMap<Integer,String> answers=new HashMap<>();

    private HashMap<Integer,String> answerKey=new HashMap<>();


    public ExamSession(){
        answerKey.put(1,"A");
        answerKey.put(2,"B");
        answerKey.put(3,"C");
        answerKey.put(4,"D");
        answerKey.put(5,"E");
    }


    public void visitQuestion(int questionId){
        navigate.push(questionId);
        System.out.println("visited question: "+questionId);
    }



    public void answerQuestion(int questionId,String answer){
        answers.put(questionId,answer.toUpperCase());
        System.out.println("answer saved");
    }



    public void goBack(){
        if(!navigate.isEmpty()){
            System.out.println("went back from question: "+navigate.pop());
        }
        else{
            System.out.println("no question to go back");
        }
    }

    public int scoreCalculation(){
        int score=0;

        for(int questionId: answerKey.keySet()){
            if(answers.containsKey(questionId) && answers.get(questionId).equals(answerKey.get(questionId))){
                score++;
            }   
        }
        return score;
    }



    public int totalQuestions(){
        return answerKey.size();
    }








}
