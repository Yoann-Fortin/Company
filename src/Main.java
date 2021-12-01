
public class Main {

	public static void main(String[] args) {
		Staff staff = new Staff();
		
		staff.addEmployee(new SaleEmployee("Pierre", "Business",45, "1995", 30000));
		staff.addEmployee(new RepresentationEmployee("Léon", "Vendtout", 25, "2001", 20000));
		staff.addEmployee(new ProductionEmployee("Yves", "Bosseur", 28, "1998", 1000));
		staff.addEmployee(new ManutentionEmployee("Jeanne", "Stocketout", 32, "1998", 45));
		staff.addEmployee(new RiskProductionEmployee("Jean", "Flippe", 28, "2000", 1000));
		staff.addEmployee(new RiskManutentionEmployee("Al", "Abordage", 30, "2001", 45));
		
		staff.calculSalary();
		
		System.out.println();
		
		staff.averageSalary();
	}
}
