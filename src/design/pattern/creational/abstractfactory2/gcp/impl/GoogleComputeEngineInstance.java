package design.pattern.creational.abstractfactory2.gcp.impl;

import design.pattern.creational.abstractfactory2.Instance;
import design.pattern.creational.abstractfactory2.Storage;

public class GoogleComputeEngineInstance implements Instance {

	@Override
	public void start() {
		System.out.println("Start the GoogleComputeEngineInstance instance.");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to GoogleComputeEngineInstance instance.");

	}

	@Override
	public void stop() {
		System.out.println("Stop the GoogleComputeEngineInstance instance.");
	}

}
