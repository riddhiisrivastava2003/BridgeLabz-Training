import java.util.Comparator;

public class WaterLevelComparator implements Comparator<WaterTank>{
    @Override

    public int compare(WaterTank t1, WaterTank t2){
        return Integer.compare(t1.getCurrentLevel(), t2.getCurrentLevel());
    }
}