package design.pattern.creational.abst.factory.pattern;

public class Bear implements Animal {

	@Override
	public String getAnimal() {
		return "Bear is beautiful animal.";
	}

	@Override
	public String makeSound() {
		return "Bear Bear Bear.";
	}

}
