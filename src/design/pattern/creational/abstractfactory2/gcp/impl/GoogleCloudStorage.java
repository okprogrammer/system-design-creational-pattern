package design.pattern.creational.abstractfactory2.gcp.impl;

import design.pattern.creational.abstractfactory2.Storage;

public class GoogleCloudStorage implements Storage {

	@Override
	public String getId() {
		return String.valueOf(Math.random() * 1000);
	}
}
