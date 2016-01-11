/**
 * 
 */
package com.myproject.training.di.googlejuice;

import javax.inject.Inject;




import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author shiva koduri
 *
 */
public class MyApplicationTest {
	
	private Injector injector;
	
	@Before
	public void setUp() throws Exception {
		injector  = Guice.createInjector(new AbstractModule() {
			
			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
				
			}
		});
	}
	
	@After
	public void tearDown() throws Exception{
		injector = null;
	}
	
	@Test
	public void test(){
		MyApplication appTest = injector.getInstance(MyApplication.class);
		System.out.println(appTest.sendMessage("Shiva", "abc@xyz.com"));
		Assert.assertEquals(true, appTest.sendMessage("Shiva", "abc@xyz.com"));
	}

}
