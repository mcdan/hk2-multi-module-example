package org.mcdan.hk2.samples.multimodule;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.mcdan.hk2.samples.multimodule.message.MessageFactory;
import org.mcdan.hk2.samples.multimodule.user.UserFactory;


public class Application  {

	public static void main(String[] args) {
		ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator("test");
		UserFactory l = locator.getService(UserFactory.class);
		System.out.println("In startup: " + l.getUser().getUserName());
		final Application app = locator.create(Application.class);
		locator.inject(app);
		app.doSomething();
	}

	@Inject
	private UserFactory userFactory;

	@Inject
	private MessageFactory messageFactory;
	
	public Application() {

	}
	
	public void doSomething() {
		System.out.println("From user service: " + userFactory.getUser().getUserName());
		System.out.println("From message service: " + messageFactory.getMessage("from app.").getSubject());
	}
}