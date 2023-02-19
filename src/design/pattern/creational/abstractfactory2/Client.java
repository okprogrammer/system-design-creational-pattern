package design.pattern.creational.abstractfactory2;

import design.pattern.creational.abstractfactory2.Instance.capacity;
import design.pattern.creational.abstractfactory2.aws.impl.AwsResourceFactory;
import design.pattern.creational.abstractfactory2.gcp.impl.GCPResourceFactory;

public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		Client aws = new Client(new AwsResourceFactory());
		Instance instance = aws.createServer(capacity.large, 200450);
		instance.start();
		instance.stop();
		System.out.println("==============================================");
		Client gcp = new Client(new GCPResourceFactory());
		Instance gcpInstance = gcp.createServer(capacity.micro, 200450);
		gcpInstance.start();
		gcpInstance.stop();
	}

	private Instance createServer(capacity capacity, int storage) {
		Instance instance = factory.createInstance(capacity);
		Storage createStorage = factory.createStorage(storage);
		instance.attachStorage(createStorage);
		return instance;
	}

}
