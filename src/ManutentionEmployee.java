
public class ManutentionEmployee extends Employee {
	private float nbHours;
	private final int multiplicator = 20;
	
	protected ManutentionEmployee(String lastName, String firstName, int age, String dateEntry, float nbHours) {
		super(lastName, firstName, age, dateEntry);
		this.nbHours = nbHours;
	}

	@Override
	public float calculSalary() {
		return nbHours * multiplicator;
	}
	
	@Override
	public String getName() {
		return ("Employé de manutention " + super.getName());
	}
}