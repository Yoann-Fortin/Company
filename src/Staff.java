import java.text.DecimalFormat;
import java.util.ArrayList;

public class Staff {
	ArrayList<Employee> employees;
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Staff() {
		this.employees = new ArrayList<Employee>();
	}
	
	public Staff(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void calculSalary() {
		for (Employee employee : employees) {
			System.out.println("Le salaire de " + employee.getName() + " est de " + df.format(employee.calculSalary()) + " euros");
		}
	}
	
	public void averageSalary() {
		float sumSalaries = 0;
		float averageSalary = 0;
		for (Employee employee : employees) {
			sumSalaries += employee.calculSalary();
		}
		averageSalary = sumSalaries / employees.size();
		System.out.println("Le salaire moyen dans l'entreprise est de " + df.format(averageSalary) + " euros");
	}
}
