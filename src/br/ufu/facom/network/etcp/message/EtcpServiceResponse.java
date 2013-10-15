package br.ufu.facom.network.etcp.message;

import java.io.Serializable;

public class EtcpServiceResponse  extends EtcpServiceMessage implements Serializable{
	private static final long serialVersionUID = 1621848842545014708L;

	protected boolean sucess = false;
	protected String message = "";
	protected Object returnValue = "";

	public EtcpServiceResponse(){
	}
	
	public EtcpServiceResponse(EtcpService service){
		super(service);
	}
	public Object getReturnValue() {
		return returnValue;
	}
	public void setReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}
	
	public boolean isSucess() {
		return sucess;
	}

	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}