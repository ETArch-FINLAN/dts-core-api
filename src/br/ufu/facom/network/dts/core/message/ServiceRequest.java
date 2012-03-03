package br.ufu.facom.network.dts.core.message;

import java.util.Properties;
import java.io.Serializable;

public class ServiceRequest extends ServiceMessage implements Serializable{
	private static final long serialVersionUID = 1621848842545014708L;
	
	protected Properties properties = new Properties();
	
	public ServiceRequest(){
	}
	public ServiceRequest(Service service){
		super(service);
	}
	
	public Object getProperty(String key) {
		return properties.get(key);
	}

	public void putProperty(String key, Object value) {
		this.properties.put(key, value);
	}

}