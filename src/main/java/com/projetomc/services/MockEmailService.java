package com.projetomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
//Para eliminar o erro //The injection point has the following annotations: @org.springframework.beans.factory.annotation.Autowired(required=true)
public class MockEmailService extends AbstractEmailService{
	private static final Logger LOG	= LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void enviaEmail(SimpleMailMessage msg) {
		LOG.info("Simulando o envio de email ...");
		LOG.info(msg.toString());
		LOG.info("Email enviado");
		
	}

}
