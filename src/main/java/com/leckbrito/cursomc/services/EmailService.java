package com.leckbrito.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.leckbrito.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
