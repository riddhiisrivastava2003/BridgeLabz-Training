import java.util.*;

public class Doctors{

    private int id;
    private String docName;
    private Specialization specialization;
    private Set<String> bookedSlots=new HashSet<>();


    public Doctors(int id, String docName, Specialization specialization){
        this.id=id;
        this.docName=docName;
        this.specialization=specialization;
    }


    public boolean isSlotAvailable(String slot){
        return !bookedSlots.contains(slot);
    }

    public void bookSlot(String slot){
        bookedSlots.add(slot);
    }

    public String getName(){
        return docName;
    }
    public Specialization getSpecialization(){
        return specialization;
    }
}