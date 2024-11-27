package tr.edu.maltepe.oop;
public  class InheritanceMain {

 public static void main(String[]args) {
     // Create instances of HourlyEmployee and SalariedEmployee
     Employee[] employees = new Employee[2];
     employees[0] = new HourlyEmployee ("Your Name", 1001, 50.0, 200);
     employees[1] = new SalariedEmployee ("Ali Veli", 1002, 120000.0);

     // Print employee information and monthly salaries
     for (Employee employee : employees) {
         System.out.println ("Employee Name: " + employee.getName ( ));
         System.out.println ("Employee ID: " + employee.getEmployeeId ( ));
         System.out.println ("Monthly Salary: " + employee.calculateMonthlySalary ( ) + " TL\n");
     }
 }}


