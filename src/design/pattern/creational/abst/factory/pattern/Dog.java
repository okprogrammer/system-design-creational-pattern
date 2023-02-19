package design.pattern.creational.abst.factory.pattern;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog is beautiful animal.";
	}

	@Override
	public String makeSound() {
		return "Bhow Bhow.";
	}

}
