package design.pattern.creational.singelton;

public class LazyRegistryIODH {

	private LazyRegistryIODH() {

	}

	private static class RegistryHolder {
		static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}

	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}
}
