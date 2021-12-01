
public abstract class Employee {
	private String lastName;
	private String firstName;
	private int age;
	private String dateEntry;
	
	protected Employee (String lastName, String firstName, int age, String dateEntry) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.dateEntry = dateEntry;
	}
	
	protected abstract float calculSalary();
	
	protected String getName() {
		return (this.getLastName() + " " + this.getFirstName());
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getDateEntry() {
		return dateEntry;
	}

	protected void setDateEntry(String dateEntry) {
		this.dateEntry = dateEntry;
	}
}
