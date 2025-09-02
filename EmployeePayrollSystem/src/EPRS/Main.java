package EPRS;


public class Main {

	public static void main(String[] args) {

		
		PayRollSystem payrollsystem = new PayRollSystem();
		
		FullTimeEmployee emp1 = new FullTimeEmployee("Murali", 101, 59000.00);
		FullTimeEmployee emp2 = new FullTimeEmployee("Vijay", 102, 68000.00);
		FullTimeEmployee emp3 = new FullTimeEmployee("Kumar", 103, 75000.00);
		PartTimeEmployee emp4 = new PartTimeEmployee("Kishan", 104, 40, 130);
		PartTimeEmployee emp5 = new PartTimeEmployee("Raj", 105, 97, 110);
		

		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		payrollsystem.addEmployee(emp3);
		payrollsystem.addEmployee(emp4);
		payrollsystem.addEmployee(emp5);
		
//		String a = emp1.getName();
//		System.out.println(a);
		System.out.println("Initial employees:");
		payrollsystem.displayEmployees();
		
		payrollsystem.removeEmployee(105);
		System.out.println("Removing employee:");
		System.out.println("Remaining employees:");		
		payrollsystem.displayEmployees();
		
        
	}
}