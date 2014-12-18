package org.mcdan.hk2.samples.multimodule.message;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface MessageFactory {
	Message getMessage(final String id);
}