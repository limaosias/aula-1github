package entities;

public class Employees {

	private Integer Id;
	private String name;
	private Double Salary;

	public Employees(Integer id, String name, Double salary) {

		this.Id = id;
		this.name = name;
		this.Salary = salary;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		Salary+=Salary * percentage/100.0;
	}
	public String toString() {
		return Id + ", " + name + ", " + String.format("%.2f", Salary);
	}
}