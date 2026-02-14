import java.util.*;

public class SmartWaterTankApp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<WaterTank> tankList=new ArrayList<>();

        System.out.println("Enter number of tanks");
        int tankcount=sc.nextInt();
        sc.nextLine();



        for(int i=1;i<=tankcount;i++){
            try{
                System.out.println("Enter tank id: ");
                String id=sc.nextLine();

                 System.out.println("Enter capacity: ");
                int capacity=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter current level: ");
                int level=sc.nextInt();
                sc.nextLine();

                WaterTank tank=new WaterTank(id,capacity,level);
                tankList.add(tank);
                

            }

            catch(InvalidWaterLevelException e){
                System.out.println("Error: "+e.getMessage());
                i--;
                sc.nextLine();
            }
        }

        WaterTankManager manager=new WaterTankManager(tankList);
        manager.generateReport();
    }
}