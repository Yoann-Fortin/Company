
public class SaleEmployee extends CommercialEmployee{
	private final int fixedBonus = 400;

	public SaleEmployee(String lastName, String firstName, int age, String dateOfEntry, float monthlyRevenue) {
		super(lastName, firstName, age, dateOfEntry, monthlyRevenue);
	}
	
	@Override
	public float calculSalary() {
		return super.calculSalary() + fixedBonus;
	}
	
	@Override
	public String getName() {
		return ("Employ� de repr�sentation " + super.getName());
	}
}
