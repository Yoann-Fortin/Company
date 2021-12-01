
public class RiskProductionEmployee extends ProductionEmployee implements RiskEmployee {
	public RiskProductionEmployee(String lastName, String firstName, int age, String dateEntry, int unityProduction) {
		super(lastName, firstName, age, dateEntry, unityProduction);
	}

	@Override
	public float calculSalary() {
		return super.calculSalary() + riskBonus;
	}
}
