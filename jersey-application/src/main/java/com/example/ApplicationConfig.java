package com.example;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.mcdan.hk2.samples.multimodule.user.UserFactory;
import org.mcdan.hk2.samples.multimodule.user.impl.UserFactoryImpl;

public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(UserFactoryImpl.class).to(UserFactory.class);				
			}
		});
		packages("com.example");
	}
}
