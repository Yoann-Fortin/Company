
public class RiskManutentionEmployee extends ManutentionEmployee implements RiskEmployee {
	public RiskManutentionEmployee(String lastName, String firstName, int age, String dateEntry, int unityProduction) {
		super(lastName, firstName, age, dateEntry, unityProduction);
	}

	@Override
	public float calculSalary() {
		return super.calculSalary() + riskBonus;
	}
}
