package br.ufu.facom.network.dts.core.message.parser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import br.ufu.facom.network.dts.core.message.ServiceMessage;

public class SerializedParser implements ServiceMessageParser{

	@Override
	public ServiceMessage marshall(byte[] array) {
		ServiceMessage message = null;
		
		try{
			ByteArrayInputStream bis = new ByteArrayInputStream(array);
			ObjectInput in = new ObjectInputStream(bis);
			
			
			message = (ServiceMessage)in.readObject();

			bis.close();
			in.close();
			
		}catch(Exception e){
			System.err.println("Error on marshalling of ServiceMessage: "+e.getMessage());
		}
		
		return message;
	}

	@Override
	public byte[] unmarshall(ServiceMessage message) {
		byte[] bytes = null;
		
		try{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutput out = new ObjectOutputStream(bos);   
			out.writeObject(message);
			
			bytes = bos.toByteArray(); 
	
			out.close();
			bos.close();

		}catch(Exception e){
			System.err.println("Error on unmarshalling of ServiceMessage: "+e.getMessage());
		}
		
		return bytes;
	}
	
}
