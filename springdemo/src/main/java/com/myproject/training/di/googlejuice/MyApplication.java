/**
 * 
 */
package com.myproject.training.di.googlejuice;

import javax.inject.Inject;

/**
 * @author shiva koduri
 *
 */
public class MyApplication {
	
	private MessageService messageService;
	
	//constructor based injector
//	@Inject
//	public MyApplication(MessageService messageService){
//		this.messageService=messageService;
//	}
	
	//Settor method injector
	@Inject
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public boolean sendMessage(String msg, String recipient){
		return messageService.sendMessage(msg, recipient);
	}
	

}
