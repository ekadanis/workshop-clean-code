public class Manager extends Employee {
    public Manager(String name, int workHours, int hourlyRate){
        super(name, workHours, hourlyRate);
    }

    @Override
    public String getDisplayName() {
        return "Manager Name : " + getName();
    }
}