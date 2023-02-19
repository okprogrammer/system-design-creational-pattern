package design.pattern.creational.prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Company c = new Company("Capgemini");
		c.loadData();
		//System.out.println(c);

		Company c1 = (Company) c.clone();
		c1.setCompany("Qburst");
		c1.setEmpList(null);
		System.out.println(c1);
		System.out.println(c);
	}
}
