import java.util.*;

public class ConsultationService{

    private Map<Specialization, List<Doctors>> doctorMap=new HashMap<>();
    private List<Appointment> history=new ArrayList<>();

    public void addDoctor(Doctors doctor){
        doctorMap
        .computeIfAbsent(doctor.getSpecialization(), k->new ArrayList<>())
        .add(doctor);
    }

    public void bookAppointment(
        Specialization specialization, int doctorIndex,
        Patient patient, String slot
    )throws SlotUnavailableException{
        List<Doctors> doctors=doctorMap.get(specialization);

        if(doctors==null || doctors.isEmpty()){
            throw new SlotUnavailableException("No doctors available");
        }

        Doctors doctor =doctors.get(doctorIndex);
        if(!doctor.isSlotAvailable(slot)){
            throw new SlotUnavailableException("Slot already booked");
        }

        doctor.bookSlot(slot);
        Appointment appointment=new Appointment(doctor,patient,slot);
        history.add(appointment);

        System.out.println("Appointment booked successfully");
    
    }


    public void showHistory(){
        System.out.println("Consultation History: ");
        history.forEach(System.out::println);
    }

    public void showDoctors(Specialization specialization){
        List<Doctors> doctors=doctorMap.get(specialization);
        for(int i=0;i<doctors.size();i++){
            System.out.println(i+". "+doctors.get(i).getName());
        }
    }
}