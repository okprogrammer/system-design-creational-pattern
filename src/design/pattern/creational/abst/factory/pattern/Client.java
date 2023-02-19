package design.pattern.creational.abst.factory.pattern;

//reference of abstract factory pattern
//https://www.baeldung.com/java-abstract-factory-pattern
public class Client {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AbstractFactory<AnimalFactory> animalFactory = (AbstractFactory<AnimalFactory>) FactoryProvider
				.getFactory("animal");
		Animal animal = (Animal) animalFactory.create("Dog");
		String animalName = animal.getAnimal();
		String sound = animal.makeSound();
		System.out.println(animalName);
		System.out.println(sound);
		AbstractFactory<ColorFactory> colorFactory = (AbstractFactory<ColorFactory>) FactoryProvider
				.getFactory("color");
		Color color = (Color) colorFactory.create("White");
		String white = color.getColor();
		System.out.println(white);
	}
}
