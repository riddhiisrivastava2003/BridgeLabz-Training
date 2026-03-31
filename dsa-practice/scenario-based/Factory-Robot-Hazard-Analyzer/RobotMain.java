import java.util.*;

public class RobotMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        RobotHazardAuditor auditor=new RobotHazardAuditor();
        ArrayList<Robot> robots=new ArrayList<>();

        System.out.print("Enter number of robots:");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=n;i++){
            try{
                System.out.println("Enter details of robot "+i+" : ");
                System.out.print("Arm-Precision (0.0-1.0):");
                double armPrecision=sc.nextDouble();

                System.out.print("Worker-Density (1-20):");
                int workerDensity=sc.nextInt();
                sc.nextLine();

                System.out.print("Machinery State (Worn/Faulty/Critical):");
                String machineryState=sc.nextLine();

                double hazardScore=auditor.CalculatingRisk(armPrecision,workerDensity,machineryState);

                Robot robot=new Robot(armPrecision,workerDensity,machineryState,hazardScore);

                
                
                robots.add(robot);
                System.out.println("Robot Hazard Risk Score: "+robot.hazardScore);
            }
            catch(RobotSafetyException e){
                System.out.println(e.getMessage()+"\n");
                sc.nextLine();
                i--;
            }
            catch(Exception e){
                System.out.println("Invalid input!!");
                sc.nextLine();
                i--;
            }
        }

        Collections.sort(robots,Comparator.comparingDouble(r->-r.hazardScore));
        System.out.println("----Robots sorted by hazard risk score----");
        for(int i=0;i<robots.size();i++){
            Robot r=robots.get(i);
            System.out.println("Robot "+(i+1)+":");
            System.out.println("Arm-Precision: "+r.armPrecision);
            System.out.println("Worker-Density: "+r.workerDensity);
            System.out.println("Machinery State: "+r.machineryState);
            System.out.println("Hazard Risk Score: "+r.hazardScore);
            System.out.println();
        }

        

        
    }
}