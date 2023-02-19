package design.pattern.creational.factory;

/*
 * This is our abstract "creator".
 * */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}

	// Factory Method
	public abstract Message createMessage();

}
