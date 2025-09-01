import java.io.PrintStream;

public class SalaryCalculator {
   public SalaryCalculator() {
   }

   public int calculateSalary(Employee employee) {
      int salary = employee.getWorkHours() * employee.getHourlyRate();
      return salary;
   }

   public void printSalary(Employee employee) {
      int salary = this.calculateSalary(employee);
      System.out.println(employee.getDisplayName() + " | Salary : " + salary);
   }
}
