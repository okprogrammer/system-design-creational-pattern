package design.pattern.creational.abstractfactory2;

public interface Instance {

	enum capacity {
		micro, small, large
	}

	void start();

	void attachStorage(Storage storage);

	void stop();

}
