package design.pattern.creational.abstractfactory2.aws.impl;

import design.pattern.creational.abstractfactory2.Instance;
import design.pattern.creational.abstractfactory2.Storage;

public class EC2Instance implements Instance {

	public EC2Instance(capacity capacity) {
		System.out.println("Created instance with "+capacity.name());
	}

	@Override
	public void start() {
		System.out.println("Start the EC2 instance.");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to EC2 instance.");

	}

	@Override
	public void stop() {
		System.out.println("Stop the EC2 instance.");
	}

}
