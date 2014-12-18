package org.mcdan.hk2.samples.multimodule.user;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface UserFactory {
	User getUser();
}