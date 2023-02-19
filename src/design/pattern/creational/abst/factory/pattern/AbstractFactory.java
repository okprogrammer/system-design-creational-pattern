package design.pattern.creational.abst.factory.pattern;

public interface AbstractFactory <T>{
	T create(String factoryType);
}
