/**
 * 
 */
package com.myproject.training.di.googlejuice;

/**
 * @author shiva koduri
 *
 */
public class MockMessageService implements MessageService{
	
	@Override
	public boolean sendMessage(String msg, String recipient) {
		return true;
	}

}
