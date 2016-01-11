/**
 * 
 */
package com.myproject.training.di.googlejuice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author shiva koduri
 * Google Guice is the framework to automate the dependency injection in applications.
 */
public class ClientApplication {
	
	public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());        
         
        MyApplication app = injector.getInstance(MyApplication.class);
         
        app.sendMessage("Shiva", "abc@xyz.com");
    }
      

}
