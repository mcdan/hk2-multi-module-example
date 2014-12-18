package org.mcdan.hk2.samples.multimodule.message.impl;

import org.mcdan.hk2.samples.multimodule.message.Message;

public class MessageImpl implements Message {
	 final private String content;
	 public MessageImpl(final String content) {
	 	this.content = content;
	 }

	public String getSubject() {
		return this.content;
	}
}