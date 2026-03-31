 public class WaterTank{

    private String tankId;
    private int capacity;
    private int currentLevel;


    public WaterTank(String tankId, int capacity,int currentLevel)throws InvalidWaterLevelException{

        if(currentLevel>capacity){
            throw new InvalidWaterLevelException("current level cannot exceed tank capacity "+tankId);
        }
        this.tankId=tankId;
        this.capacity=capacity;
        this.currentLevel=currentLevel;
    }

    public double getUsagePercentage(){
        return ((double) currentLevel/capacity)*100;
    }

    public boolean isBelowThreshold(){
        return getUsagePercentage()<20;
    }

    public int getCurrentLevel(){
        return currentLevel;
    }
    public String getTankId(){
        return tankId;
    }
    public int getCapacity(){
        return capacity;
    }

    @Override

    public String toString(){

        return "tank id: "+tankId+" | capacity: "+capacity+" | current level: "+currentLevel+" | usage: "+String.format("%.2f",getUsagePercentage()+"%");

    }




 }