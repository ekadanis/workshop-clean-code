public class Employee {
    String name;
    int workHours;
    int hourlyRate;

    public Employee(String name, int workHours, int hourlyRate) {
        this.name = name;
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return this.name;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }

    public String getDisplayName() {
        return "Nama : " + this.name;
    }
}
