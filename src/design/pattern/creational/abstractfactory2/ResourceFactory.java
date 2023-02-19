package design.pattern.creational.abstractfactory2;

public interface ResourceFactory {
	Instance createInstance(Instance.capacity capacity);

	Storage createStorage(int capMib);
}
