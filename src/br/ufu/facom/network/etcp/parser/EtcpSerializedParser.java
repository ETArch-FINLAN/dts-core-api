package br.ufu.facom.network.etcp.parser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import br.ufu.facom.network.etcp.message.EtcpServiceMessage;

public class EtcpSerializedParser implements EtcpServiceMessageParser{

	@Override
	public EtcpServiceMessage marshall(byte[] array) {
		EtcpServiceMessage message = null;
		
		try{
			ByteArrayInputStream bis = new ByteArrayInputStream(array);
			ObjectInput in = new ObjectInputStream(bis);
			
			
			message = (EtcpServiceMessage)in.readObject();

			bis.close();
			in.close();
			
		}catch(Exception e){
			System.err.println("Error on marshalling of ServiceMessage: "+e.getMessage());
		}
		
		return message;
	}

	@Override
	public byte[] unmarshall(EtcpServiceMessage message) {
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
