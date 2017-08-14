package mx.org.inegi.geo.mail.service;

import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.model.MailResponse;

public interface MailService {
	public MailResponse sendMail(MailRequest mailRequest);
}
