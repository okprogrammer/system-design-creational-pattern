package design.pattern.creational.singelton;

public class Client {
	public static void main(String[] args) {

		EagerRegistry registry1 = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry1 == registry2);
		System.out.println("-----------LAZY SINGELTON-------------");
		LazyRegistryWithDCL lazyRegistry1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyRegistry1 == lazyRegistry2);
		System.out.println("-----------LAZY Instance holder using static inner classSINGELTON-------------");
		LazyRegistryIODH registryIODH1 = LazyRegistryIODH.getInstance();
		LazyRegistryIODH registryIODH2 = LazyRegistryIODH.getInstance();
		System.out.println(registryIODH1 == registryIODH2);
	}
}
