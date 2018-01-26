package org.sevenzero.spring.test;

import java.util.logging.Logger;

import org.sevenzero.spring.test.bean.AAA;
import org.sevenzero.spring.test.bean.BBB;
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
public class AppConfig {
	
	static final Logger log = Logger.getLogger(AppConfig.class.getSimpleName());
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-config.xml");
		
		AAA a = (AAA) context.getBean("aaa");
		log.warning(a.getA2());
		
		BBB b = (BBB) context.getBean("bbb");
		log.warning(b.getPath());
		
		
		
		
		
	}
}
