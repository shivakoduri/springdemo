/**
 * 
 */
package com.myproject.training.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shiva koduri
 *
 */
public class MyMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		MyService myService = ctx.getBean(MyService.class);
		
		myService.log("Hi");
		
		MyService newService = ctx.getBean(MyService.class);
		System.out.println("service hashCode:"+ myService.hashCode());
		System.out.println("my service hashCode:"+newService.hashCode());
		
		ctx.close();
		

	}

}
