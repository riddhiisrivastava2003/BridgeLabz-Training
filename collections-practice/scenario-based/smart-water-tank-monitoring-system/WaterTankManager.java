import java.util.*;

public class WaterTankManager{
    private List<WaterTank> tanks;

    public WaterTankManager(List<WaterTank> tanks){
        this.tanks=tanks;
    }

    public void generateReport(){

        Collections.sort(tanks,new WaterLevelComparator());

        System.out.println("Water tank status report");

        for(WaterTank tank:tanks){
            System.out.println(tank);

            if(tank.isBelowThreshold()){
                System.out.println("Water level below 20% "+tank.getTankId() );
            }
        }
    }
}