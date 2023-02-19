package design.pattern.creational.simple.factory;

public class LaptopFactory {

	public static Laptop createLaptop(LaptopType type) {
		if (type == null) {
			return null;
		}
		switch (type) {
		case GamingLaptop:
			return new GamingLaptop();
		case NormalLaptop:
			return new GamingLaptop();

		default:
			return null;
		}
	}

}
