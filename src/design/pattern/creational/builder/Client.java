package design.pattern.creational.builder;

public class Client {
	public static void main(String[] args) {
		User user1 = User.getUserBuilder().firstName("OM").lastName("Kumar").age(25).address("Alpha").phone("788974789789").build();
		System.out.println(user1);
	}
}
