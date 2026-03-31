import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        ConsultationService service = new ConsultationService();
        Scanner sc = new Scanner(System.in);

        service.addDoctor(new Doctors(1, "Dr. Sharma", Specialization.CARDIOLOGIST));
        service.addDoctor(new Doctors(2, "Dr. Mehta", Specialization.DERMATOLOGIST));
        service.addDoctor(new Doctors(3, "Dr. Gupta", Specialization.GENERAL_PHYSICIAN));
        service.addDoctor(new Doctors(4, "Dr. Srivastava", Specialization.NEUROLOGIST));



    
        System.out.print("Enter patient name: ");
        String patientName = sc.nextLine();

        if (patientName.isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }

        Patient patient = new Patient(1, patientName);

        try {

            System.out.println("Choose specialization:");
            System.out.println("1. CARDIOLOGIST");
            System.out.println("2. DERMATOLOGIST");

            int choice = sc.nextInt();

            Specialization specialization =
                    choice == 1 ? Specialization.CARDIOLOGIST : Specialization.DERMATOLOGIST;

            service.showDoctors(specialization);

            System.out.print("Choose doctor index: ");
            int doctorIndex = sc.nextInt();

            sc.nextLine(); 

            System.out.print("Enter slot (eg: 10AM): ");
            String slot = sc.nextLine();

            if (slot.isEmpty()) {
                System.out.println("Slot cannot be empty");
                return;
            }

            service.bookAppointment(specialization, doctorIndex, patient, slot);

        } catch (SlotUnavailableException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        service.showHistory();
    }
}
