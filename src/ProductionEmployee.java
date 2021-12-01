
public class ProductionEmployee extends Employee{
	private int unityProduction;
	private final int multiplicator = 5;

	public ProductionEmployee(String lastName, String firstName, int age, String dateEntry, int unityProduction) {
		super(lastName, firstName, age, dateEntry);
		this.unityProduction = unityProduction;
	}

	@Override
	protected float calculSalary() {
		return unityProduction * multiplicator;
	}
	
	@Override
	public String getName() {
		return ("Employé de production " + super.getName());
	}
}
