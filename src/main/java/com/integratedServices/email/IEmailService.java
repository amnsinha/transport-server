package com.integratedServices.email;

public interface IEmailService {
	public boolean sendWelcomeEmail(String emailId, String token, String userId);
}
