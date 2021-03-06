package br.com.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{
	
	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage mailMessage) {
		LOG.info("Enviando e-mail...");
		LOG.info(mailMessage.toString());
		LOG.info("E-mail enviado");
		
	}

}
