public class RobotHazardAuditor{

    public double CalculatingRisk(double armPrecision, int workerDensity,String machineryState) throws RobotSafetyException{
        if(armPrecision<0.0||armPrecision>1.0)
            throw new RobotSafetyException("Error: Arm-Precision must be 0.0-1.0");

        if(workerDensity<1 ||workerDensity>20)
            throw new RobotSafetyException("Error: Worker-Density must be 1-20");
        double machineRiskfactor;

        switch(machineryState){
            case "Worn":
                machineRiskfactor=1.3;
                break;
            case "Faulty":
                machineRiskfactor=2.0;
                break;
                case "Critical":
                    machineRiskfactor=3.0;
                    break;
                default:
                    throw new RobotSafetyException("Error: Unsupported machinery state");

                
        }
        return((1.0-armPrecision)*15.0)+(workerDensity*machineRiskfactor);
        
    }
}