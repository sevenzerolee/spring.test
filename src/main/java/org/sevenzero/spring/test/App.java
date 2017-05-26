package org.sevenzero.spring.test;

import java.util.logging.Logger;

import org.sevenzero.spring.test.action.OtherAction;
import org.sevenzero.spring.test.action.SubAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author lb
 * @version 1.0.1
 * @Description
 * @date 2017年5月26日
 *
 */
public class App {
	
	static final Logger log = Logger.getLogger(App.class.getSimpleName());
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Service service = (Service) context.getBean("service");
//		service.doSomething();
		
//		Service serviceRead = (Service) context.getBean("serviceRead");
//		serviceRead.doSomething();
		
		OtherAction otherAction = (OtherAction) context.getBean("otherAction");
		otherAction.doSomething();
		
		SubAction subAction = (SubAction) context.getBean("subAction");
		subAction.doAnything();
		subAction.doSomething();
		
		subAction.doAnythingSuper();
		subAction.doSomethingSuper();
		
	}
}
