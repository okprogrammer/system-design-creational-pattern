package design.pattern.creational.abstractfactory2.aws.impl;

import design.pattern.creational.abstractfactory2.Instance;
import design.pattern.creational.abstractfactory2.Instance.capacity;
import design.pattern.creational.abstractfactory2.ResourceFactory;
import design.pattern.creational.abstractfactory2.Storage;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(capacity capacity) {
		return new EC2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}

}
