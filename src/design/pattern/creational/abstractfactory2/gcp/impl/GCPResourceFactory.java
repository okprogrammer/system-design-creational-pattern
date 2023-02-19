package design.pattern.creational.abstractfactory2.gcp.impl;

import design.pattern.creational.abstractfactory2.Instance;
import design.pattern.creational.abstractfactory2.Instance.capacity;
import design.pattern.creational.abstractfactory2.ResourceFactory;
import design.pattern.creational.abstractfactory2.Storage;

public class GCPResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(capacity capacity) {
		return new GoogleComputeEngineInstance();
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage();
	}

}
