public class Appointment{
    private Doctors doctor;
    private Patient patient;
    private String slot;



    public Appointment(Doctors doctor, Patient patient,String slot){
        this.doctor=doctor;
        this.patient=patient;
        this.slot=slot;
    }

    @Override

    public String toString(){
        return "Appointment-> "+"Doctor-> "+doctor.getName()+" | Patient-> "+patient.getName()+" | Slot-> "+slot+'\'';
    }
}