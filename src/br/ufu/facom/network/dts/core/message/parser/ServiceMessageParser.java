package br.ufu.facom.network.dts.core.message.parser;

import br.ufu.facom.network.dts.core.message.ServiceMessage;
import br.ufu.facom.network.dts.core.message.ServiceRequest;

public interface ServiceMessageParser {
	public ServiceMessage marshall(byte[] array);
	public byte[] unmarshall(ServiceMessage message);
}
