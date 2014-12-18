package org.mcdan.hk2.samples.multimodule.message.impl;

import org.jvnet.hk2.annotations.Service;
import org.mcdan.hk2.samples.multimodule.message.MessageFactory;
import org.mcdan.hk2.samples.multimodule.message.Message;

@Service
public class MessageFactoryImpl implements MessageFactory {
	public MessageFactoryImpl() {

	}

	public Message getMessage(final String id) {
		return new MessageImpl(id + "some content!");
	}
}