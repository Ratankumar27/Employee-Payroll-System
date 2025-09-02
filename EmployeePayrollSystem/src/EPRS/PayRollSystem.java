package EPRS;
import java.util.*;


class PayRollSystem {
	
	ArrayList<Employee> employeeList;
	
	public PayRollSystem() {
		employeeList = new ArrayList<>();
	}
	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		
		for(Employee e: employeeList) {
			if(e.getId()==id) {
				employeeToRemove = e;
				break;
			}
		}
		
		if(employeeToRemove!=null) {
			employeeList.remove(employeeToRemove);
		}
	}

	
	public void displayEmployees() {
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
	}
}
