package org.sevenzero.spring.test.action;

import org.sevenzero.spring.test.service.spi.Service;

public class Action {
	
	protected Service service;
	
	protected Service serviceRead;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Service getServiceRead() {
		return serviceRead;
	}

	public void setServiceRead(Service serviceRead) {
		this.serviceRead = serviceRead;
	}

}
