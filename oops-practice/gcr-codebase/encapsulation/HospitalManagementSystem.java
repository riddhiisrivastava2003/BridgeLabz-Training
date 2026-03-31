import java.util.*;

interface MedicalRecord{
    void addRecord(String diagnosis);
    void displayRecords();
}




abstract class Patient implements MedicalRecord{

    private int pateintId;
    private String name;
    private int age;

    private List<String> medicalHistory=new ArrayList<>();


    public Patient(int pateintId,String name,int age){
        this.pateintId=pateintId;
        this.name=name;
        this.age=age;

    }

    public abstract double calculateBill();


    public void getPatientDetails(){
        System.out.println("patient id: "+pateintId);
        System.out.println("pateint name: "+name);
        System.out.println("patient age: "+age);

    }



    @Override

    public void addRecord(String diagnosis){
        medicalHistory.add(diagnosis);

    }

      @Override

    public void displayRecords(){

        System.out.println("medical history");
        if(medicalHistory.isEmpty()){
            System.out.println("no records found");

        }
        else{
            for(String record:medicalHistory){
                System.out.println("- "+record);

            }
        }
        // for(String record:medicalHistory){
        //     System.out.println("- "+record);

        // }
    }
}



class InPatient extends Patient{
    private int dayAdmitted;
    private double dailyCharge;


    public InPatient(int pateintId,String name, int age, int dayAdmitted,double dailyCharge){
        super(pateintId,name,age);
        this.dayAdmitted=dayAdmitted;
        this.dailyCharge=dailyCharge;

    }

    @Override
    public double calculateBill(){
        return dayAdmitted*dailyCharge;
    }
}

class OutPatient extends Patient{
    private double consultationFee;

    public OutPatient(int pateintId, String name,int age,double consultationFee){
        super(pateintId,name,age);
        this.consultationFee=consultationFee;
    }


    @Override

    public double calculateBill(){
        return consultationFee;
    }
}



public class HospitalManagementSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Patient> pateints=new ArrayList<>();

        System.out.println("enter number of patients");
        int n=sc.nextInt();

        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("enter details for patient "+(i+1));

            System.out.println("patient id");
            int id=sc.nextInt();
            sc.nextLine();

            System.out.println("patient name");
            String name=sc.nextLine();

            System.out.println("patient age");
            int age=sc.nextInt();
            sc.nextLine();

                System.out.println("enter type(1-in patient/2-out patient");
                int type=sc.nextInt();

                sc.nextLine();

                Patient patient;

                if(type==1){
                    System.out.println("enter number of days admitted");
                    int days =sc.nextInt();

                        System.out.println("enter daily charge");
                    double charge=sc.nextDouble();

                    sc.nextLine();

                    patient=new InPatient(id,name,age,days,charge);

                    
                }
                else{
                    System.out.println("enter consultation fee ");
                    double fee=sc.nextDouble();

                    sc.nextLine();

                    patient=new OutPatient(id,name,age,fee);
                }

                System.out.println("enter diagnosis");
                String diagonosis=sc.nextLine();
                patient.addRecord(diagonosis);



                pateints.add(patient);

                }


                System.out.println("patient billing deatils");
                for(Patient p: pateints){
                    p.getPatientDetails();
                    p.displayRecords();
                    System.out.println("total bill: "+p.calculateBill());
                    System.out.println();
                }


        }
    }
