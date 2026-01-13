import java.util.*;
public class OnlineExamService{
    private ArrayList<Student> students=new ArrayList<>();
    private ArrayList<Exam> exams=new ArrayList<>();
 private EvaluationStrategy strategy=new ObjectiveEvaluation();

 public void createExam(String title){
    exams.add(new Exam(title));
    System.out.println("exam created successfully");
 }

 public void addQuestion(String examIndex,String text,String answer,int marks){
    exams.get(Integer.parseInt(examIndex)).addQuestion(new Question(text,answer,marks));
    System.out.println("question added successfully");
 }

 public void addStudent(String name){
    students.add(new Student(name,0));
    System.out.println("student added successfully");
 }

 public void setMode(int choice){
    strategy=choice==1?new ObjectiveEvaluation():new DescriptiveEvaluation();
    System.out.println("mode changed successfully");
 }

 public void takeExam(int studentIndex ,int examIndex) throws ExamTimeExpiredException{
    Scanner sc=new Scanner(System.in);
        Student s=students.get(studentIndex);
        Exam e=exams.get(examIndex);
        System.out.println("starting exam "+e.getTitle());
         long start =System.currentTimeMillis();
         for(Question q:e.getQuestions()){
            if(System.currentTimeMillis()-start>60000){
                throw new ExamTimeExpiredException("exam time expired");
            }
            System.out.println(q.getText());
            String ans=sc.nextLine();
            int marks=strategy.evaluate(q,ans);
            s.addScore(marks);
            
            }
            System.out.println("exam submiteed");
        }
        public void showResult(int studentIndex ){
            Student s=students.get(studentIndex);
            System.out.println("student name: "+s.getName());
            System.out.println("student score: "+s.getScore()); 
        }

            public void listExams()
            {
                for(int i=0;i<exams.size();i++)
                {
                    System.out.println(i+" "+exams.get(i).getTitle());
                }

            }

            public void listStudents(){
                for(int i=0;i<students.size();i++)
                {
                    System.out.println(i+" "+students.get(i).getName());
                }
            }
            
            
    
    



 }

