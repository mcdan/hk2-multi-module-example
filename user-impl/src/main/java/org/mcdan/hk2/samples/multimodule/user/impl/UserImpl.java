package org.mcdan.hk2.samples.multimodule.user.impl;

import org.mcdan.hk2.samples.multimodule.user.User;

public class UserImpl implements User {
	 final private String username;
	 public UserImpl(final String username) {
	 	this.username = username;
	 }

	public String getUserName() {
		return this.username;
	}
}