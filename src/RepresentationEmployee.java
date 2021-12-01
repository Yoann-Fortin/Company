
public class RepresentationEmployee extends CommercialEmployee{
	private final int fixedBonus = 800;

	public RepresentationEmployee(String lastName, String firstName, int age, String dateOfEntry, float monthlyRevenue) {
		super(lastName, firstName, age, dateOfEntry, monthlyRevenue);
	}

	@Override
	public float calculSalary() {
		return super.calculSalary() + fixedBonus;
	}
	
	@Override
	public String getName() {
		return ("Employé de représentation " + super.getName());
	}
}
