import java.util.*;

public class ResumeScreening{
    public static void screenResume(List<? extends JobRole> resumes){
        System.out.println("screening resumes");
        for(JobRole role:resumes){
            System.out.println("candidate "+role.getCandidateName());

        }

        System.out.println("resumes screened successfully");
    
    }
}