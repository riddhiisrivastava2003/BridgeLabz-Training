import java.util.Scanner;
class Device{
    String deviceId;
    String status;

    Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;

    }
    void displayStatus(){
        System.out.println("device id: " + deviceId);
        System.out.println("device status: " +  status);

    }
}

class Thermostat extends Device {
    int tempSetting;
    Thermostat(String deviceId, String status, int tempSetting){
        super(deviceId ,status);
        this.tempSetting = tempSetting;


    }

    void displayStatus(){
        super.displayStatus();

        System.out.println("temperarture setting in celcius:" +tempSetting);

    }
}

public class Devices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter device id: ");

        String deviceID = sc.nextLine();

        System.out.println("enter device status (on/ off)): ");

        String status = sc.nextLine();
        
        System.out.println("enter temperature setting (in celcius): ");

        int temperature = sc.nextInt();

        Thermostat thermostat = new Thermostat(deviceID , status , temperature);

        System.out.println("Device Status");
        thermostat.displayStatus();


    }
    
}