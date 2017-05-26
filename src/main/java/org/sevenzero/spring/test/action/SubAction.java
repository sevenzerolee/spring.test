package org.sevenzero.spring.test.action;

import org.sevenzero.spring.test.service.spi.Service;

public class SubAction extends Action {
	
	protected Service service;
	
	protected Service serviceRead;
	
	public void doSomething() {
		service.doSomething();
	}
	
	public void doAnything() {
		serviceRead.doSomething();
	}
	
	public void doSomethingSuper() {
		super.service.doSomething();
	}
	
	public void doAnythingSuper() {
		super.serviceRead.doSomething();
	}

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
