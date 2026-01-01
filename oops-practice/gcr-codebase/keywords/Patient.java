import java.util.*;

class Patient{
   
    static String hospitalName = " City Hospital";
    static int totalPatients = 0;


    final String patientID;

 
    String name;
    int age ; 
    String ailment;



    Patient(String patientID, String name, int age , String ailment ){
        this.patientID = patientID;
        this.name =name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;

    }



    static void getTotalPatients(){
        System.out.println("Total Patients Addmitted " + totalPatients);

    }


    void displayPatientDetails(){
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println();

    }
}

 class PatientSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Patients : ");
        int numberOfPatients = sc.nextInt();

        sc.nextLine();

        Patient[] patients = new Patient[numberOfPatients];
        for(int i = 0; i< numberOfPatients ; i++){
            System.out.println("\nEnter details for patient " + (i + 1));
            System.out.println("Patient Id : ");
            String patientID = sc.nextLine();

            System.out.println("Name : ");
            String name = sc.nextLine();

            System.out.println("Age : ");
            int age =sc.nextInt();

            sc.nextLine();
            System.out.println("Ailment : ");
            String ailment = sc.nextLine();

            patients[i] = new Patient(patientID , name , age , ailment );


        }

        Patient.getTotalPatients();
        System.out.println();


        for(Patient patient : patients ){
            if(patient instanceof Patient ){
                patient.displayPatientDetails();
            }
        }

    }
    
}