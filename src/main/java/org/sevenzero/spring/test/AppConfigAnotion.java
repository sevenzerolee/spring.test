package org.sevenzero.spring.test;

import java.util.logging.Logger;

import org.sevenzero.spring.test.bean.CCC;
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
public class AppConfigAnotion {
	
	static final Logger log = Logger.getLogger(AppConfigAnotion.class.getSimpleName());
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-config-anotion.xml");
		
		CCC c = context.getBean(CCC.class);
		log.warning(c.getPath());
		
		
	}
}
