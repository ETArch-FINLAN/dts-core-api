package br.ufu.facom.network.etcp.message;

import java.io.Serializable;

public abstract class EtcpServiceMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected EtcpService service = null;
	protected String owl = ""; //To be used on reasoner
	
	public EtcpServiceMessage(){
	}
	
	public EtcpServiceMessage(EtcpService service){
		this.service = service;
	}
	
	public EtcpService getService() {
		return service;
	}

	public void setService(EtcpService service) {
		this.service = service;
	}
}
