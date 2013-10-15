package br.ufu.facom.network.etcp.parser;

import br.ufu.facom.network.etcp.message.EtcpServiceMessage;
import br.ufu.facom.network.etcp.message.EtcpServiceRequest;

public interface EtcpServiceMessageParser {
	public EtcpServiceMessage marshall(byte[] array);
	public byte[] unmarshall(EtcpServiceMessage message);
}
