/**
 * 
 */
package com.myproject.training.di.googlejuice;

import javax.inject.Singleton;

/**
 * @author shiva koduri
 *
 */
@Singleton
public class EmailService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Email Message sent to "+ recipient + " with message:" + msg);
		return true;
	}
}
