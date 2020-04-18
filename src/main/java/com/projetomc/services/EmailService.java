package com.projetomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.projetomc.domain.Pedido;

public interface EmailService {
	
	void enviaPedidoConfirmacaEmail(Pedido obj);
	
	void enviaEmail(SimpleMailMessage msg);

}
