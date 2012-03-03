package br.ufu.facom.network.dts.core.message;

import java.io.Serializable;

public class ServiceResponse  extends ServiceMessage implements Serializable{
	private static final long serialVersionUID = 1621848842545014708L;

	protected boolean sucess = false;
	protected String message = "";
	protected Object returnValue = "";

	public ServiceResponse(){
	}
	
	public ServiceResponse(Service service){
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