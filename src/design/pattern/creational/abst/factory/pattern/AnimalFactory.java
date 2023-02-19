package design.pattern.creational.abst.factory.pattern;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		switch (animalType) {
		case "Dog":
			return new Dog();
		case "Bear":
			return new Bear();
		case "Duck":
			return new Duck();
		default:
			return null;
		}
	}

}
