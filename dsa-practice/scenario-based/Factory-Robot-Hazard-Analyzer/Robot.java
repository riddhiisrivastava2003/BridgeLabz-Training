public class Robot{
    public double armPrecision;
    public int workerDensity;
    public String machineryState;
    public double hazardScore;

    public Robot(double armPrecision, int workerDensity, String machineryState, double hazardScore){
        this.armPrecision = armPrecision;
        this.workerDensity = workerDensity;
        this.machineryState = machineryState;
        this.hazardScore=0.0;
    }
}