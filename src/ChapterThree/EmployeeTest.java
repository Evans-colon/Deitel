package ChapterThree;


public class EmployeeTest {
    public static void main(String[] args) {

        Employee newEmployee = new Employee("john", "Michael", 45000.00);
        Employee secondNewEmployee = new Employee("Mark", "Matthew", 27000.00);

    double newEmployeeMonthlySalary = newEmployee.getMonthlySalary();
    System.out.println("the new Employee monthly salary is "+ newEmployeeMonthlySalary);

    double secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
    System.out.println("the second New employee Monthly Salary is "+ secondNewEmployeeMonthlySalary);

    secondNewEmployee.setMonthlySalary(56000.00);
    secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("the current Monthly salary is "+ secondNewEmployeeMonthlySalary);

   secondNewEmployee.yearlySalary();
   secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("the current yearly salary is "+ secondNewEmployeeMonthlySalary);


   secondNewEmployee.salaryRaise();
   secondNewEmployeeMonthlySalary = secondNewEmployee.getMonthlySalary();
   System.out.println("the current salary raise is "+ secondNewEmployeeMonthlySalary);



    }
}
