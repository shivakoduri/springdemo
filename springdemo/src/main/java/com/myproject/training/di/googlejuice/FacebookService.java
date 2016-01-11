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
public class FacebookService implements MessageService {
	
	@Override
	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Message sent to Facebook user:" +recipient+ " with message:" + msg);
		return true;
	}
}
