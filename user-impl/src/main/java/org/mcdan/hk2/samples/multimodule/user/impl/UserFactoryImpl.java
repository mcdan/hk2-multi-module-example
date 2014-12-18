package org.mcdan.hk2.samples.multimodule.user.impl;

import org.jvnet.hk2.annotations.Service;
import org.mcdan.hk2.samples.multimodule.user.UserFactory;
import org.mcdan.hk2.samples.multimodule.user.User;

@Service
public class UserFactoryImpl implements UserFactory {
	public UserFactoryImpl() {

	}

	public User getUser() {
		return new UserImpl("foobar");
	}
}