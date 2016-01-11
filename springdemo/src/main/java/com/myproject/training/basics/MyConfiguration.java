/**
 * 
 */
package com.myproject.training.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiva koduri
 *
 */
@Configuration
@ComponentScan(value="com.myproject.training.basics")
public class MyConfiguration {
	
	@Bean
	public 	MyService myService(){
		return new MyService();
	}

}
