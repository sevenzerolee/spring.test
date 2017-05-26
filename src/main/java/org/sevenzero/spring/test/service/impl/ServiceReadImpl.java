package org.sevenzero.spring.test.service.impl;

import java.util.logging.Logger;

import org.sevenzero.spring.test.service.spi.Service;

public class ServiceReadImpl implements Service {
	
	private static final Logger log = Logger.getLogger(ServiceReadImpl.class.getSimpleName());

	public void doSomething() {
		
		log.info("Impl 2");

	}

}
