public class Main {
     public static void main(String args[]){
        System.out.println("\n==Salary Calculation Program==\n");

        Employee employee1 = new Employee("Budi", 40, 50000);
        Employee employee2 = new Employee("Ani", 38, 45000);
        Manager manager1 = new Manager("Toni", 45, 60000);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.printSalary(employee1);
        salaryCalculator.printSalary(employee2);
        salaryCalculator.printSalary(manager1);
    }
}
