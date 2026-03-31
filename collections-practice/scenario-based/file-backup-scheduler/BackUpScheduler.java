import java.util.*;

public class BackUpScheduler{

    private PriorityQueue<BackUpTask> queue=new PriorityQueue<>();

    public void addTask(String path, int priority) throws InvalidBackUpPathException{
        if(path==null || path.trim().isEmpty()){
            throw new InvalidBackUpPathException("Invalid path");
        

        }

        queue.add(new BackUpTask(path, priority));

        System.out.println("backup task added");
    

    }


    public void excecuteNextTask(){
        if(queue.isEmpty()){
            System.out.println("no backup tasks available ");
            return;
        
        }

        BackUpTask task=queue.poll();
        System.out.println("Executing Backup for: "+task.getFolderPath());



    }


    public void showALlTasks(){
        if(queue.isEmpty()){
            System.out.println("no tasks available");
            return;
        }

        System.out.println("backup tasks: ");
        for(BackUpTask task:queue){
            System.out.println(task);
        }
    
    }
        
}