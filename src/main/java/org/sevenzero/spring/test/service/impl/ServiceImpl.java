package org.sevenzero.spring.test.service.impl;

import java.util.logging.Logger;

import org.sevenzero.spring.test.service.spi.Service;

public class ServiceImpl implements Service {
	
	private static final Logger log = Logger.getLogger(ServiceImpl.class.getSimpleName());

	public void doSomething() {
		
		log.info("Impl 1");

	}

}
