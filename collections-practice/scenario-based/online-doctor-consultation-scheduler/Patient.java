public class Patient{

    private int id;
    private String name;

    public Patient(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return name;
    }
}