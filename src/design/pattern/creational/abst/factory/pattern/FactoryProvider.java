package design.pattern.creational.abst.factory.pattern;

public class FactoryProvider {

	public static AbstractFactory<?> getFactory(String choice) {
		switch (choice) {
		case "animal":
			return new AnimalFactory();
		case "color":
			return new ColorFactory();
		default:
			return null;
		}
	}

}
