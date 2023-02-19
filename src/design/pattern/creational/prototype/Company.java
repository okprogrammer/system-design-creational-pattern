package design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {

	private String company;

	private List<Employee> empList;

	public Company(String company) {
		this.company = company;
		this.empList = new ArrayList<>();
	}

	public void loadData() {
		for (int i = 1; i <= 10; i++) {
			empList.add(new Employee("firstName_" + i, "lastName_" + i));
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Company [company=" + company + ", empList=" + empList + "]";
	}

}
