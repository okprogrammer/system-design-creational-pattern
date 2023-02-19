package design.pattern.creational.abst.factory.pattern;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String colorType) {
		switch (colorType) {
		case "White":
			return new White();
		case "Black":
			return new Black();
		case "Brown":
			return new Brown();
		default:
			return null;
		}
	}

}
