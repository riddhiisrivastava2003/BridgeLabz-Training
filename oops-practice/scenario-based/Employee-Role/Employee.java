public abstract class Employee{
    private final double salary;
    private final String name;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }


    public abstract double getBonus();
}