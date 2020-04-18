package com.projetomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.projetomc.domain.Pedido;

public interface EmailService {
	
	void enviaPedidoConfirmacaEmail(Pedido obj);
	
	void enviaEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);

}
