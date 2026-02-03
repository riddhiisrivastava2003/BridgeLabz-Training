import java.util.*;

public class HospitalDoctorAvailability{

    static class Doctor{

        String name;
        String specialty;
        boolean availability;

        Doctor(String name, String specialty, boolean availability){
            this.name=name;
            this.specialty=specialty;
            this.availability=availability;
        }

        public boolean isAvailable(){
            return availability;

        }

        public String getSpecialty(){
            return specialty;
        }

        @Override
        public String toString(){
            return name+" - "+specialty+"(weekend Availability) ";
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Doctor> doctors=new ArrayList<>();

        System.out.println("Enter number of doctors: ");
        int n=sc.nextInt();
        sc.nextLine();


        for(int i=0;i<n;i++){
            System.out.println("Enter doctor name: ");
            String name=sc.nextLine();

            System.out.println("Enter doctor specialty: ");
            String specialty=sc.nextLine();

            System.out.println("Available on weekend? (true/false): ");
            boolean availability=sc.nextBoolean();
            sc.nextLine();

            doctors.add(new Doctor(name,specialty,availability));
        
        }


        System.out.println("Doctors available on weekends: ");
        doctors.stream()
        .filter(d->d.isAvailable())
        .sorted(Comparator.comparing(Doctor::getSpecialty))
        .forEach(System.out::println);
    }


}