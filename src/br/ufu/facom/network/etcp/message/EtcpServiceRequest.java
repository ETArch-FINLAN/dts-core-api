package br.ufu.facom.network.etcp.message;

import java.util.Properties;
import java.io.Serializable;

public class EtcpServiceRequest extends EtcpServiceMessage implements Serializable{
	private static final long serialVersionUID = 1621848842545014708L;
	
	protected Properties properties = new Properties();
	
	public EtcpServiceRequest(){
	}
	public EtcpServiceRequest(EtcpService service){
		super(service);
	}
	
	public Object getProperty(String key) {
		return properties.get(key);
	}

	public void putProperty(String key, Object value) {
		this.properties.put(key, value);
	}

}