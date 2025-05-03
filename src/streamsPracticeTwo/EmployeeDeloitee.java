package streamsPracticeTwo;

public class EmployeeDeloitee {

	Integer id;

	long salary;

	public EmployeeDeloitee(Integer id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDeloitee [id=" + id + ", salary=" + salary + "]";
	}

}
