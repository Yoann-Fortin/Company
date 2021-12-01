
public abstract class CommercialEmployee extends Employee{
	protected float monthlyRevenue;
	private final float percentageOfRevenue = 0.2f;
	
	protected CommercialEmployee(String lastName, String firstName, int age, String dateOfEntry, float monthlyRevenue) {
		super(lastName, firstName, age, dateOfEntry);
		this.monthlyRevenue = monthlyRevenue;
	}

	@Override
	protected float calculSalary() {
		return monthlyRevenue * percentageOfRevenue;
	}
}
