package design.pattern.creational.abst.factory.pattern;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck is beautiful animal.";
	}

	@Override
	public String makeSound() {
		return "Quack Quack Quack.";
	}

}
