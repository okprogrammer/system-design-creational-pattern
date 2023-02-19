package design.pattern.creational.abstractfactory2.aws.impl;

import design.pattern.creational.abstractfactory2.Storage;

public class S3Storage implements Storage {

	public S3Storage(int capMib) {
		System.out.println("Created storage " + capMib);
	}

	@Override
	public String getId() {
		return String.valueOf(Math.random() * 1000);
	}

}
