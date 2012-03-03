package br.ufu.facom.network.dts.core.message;

import java.io.Serializable;

public abstract class ServiceMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected Service service = null;
	protected String owl = ""; //To be used on reaoner
	
	public ServiceMessage(){
	}
	
	public ServiceMessage(Service service){
		this.service = service;
	}
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
}
