package design.pattern.creational.simple.factory;

public class Client {

	public static void main(String[] args) {
		Laptop laptop = LaptopFactory.createLaptop(LaptopType.GamingLaptop);
		laptop.runTests();
	}

}
