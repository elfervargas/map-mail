package mx.org.inegi.geo.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.org.inegi.geo.mail.model.MailRequest;
import mx.org.inegi.geo.mail.model.MailResponse;
import mx.org.inegi.geo.mail.service.MailService;
import mx.org.inegi.geo.map.common.web.response.ResponseFactory;

@RestController
public class MailController {
	@Autowired
	private MailService service;

	@RequestMapping(value = "/sending", method = RequestMethod.POST)
	public Object sendingMail(@RequestBody MailRequest mailRequest) {
		MailResponse mailResponse = service.sendMail(mailRequest);
		if(mailResponse.isStatus()){
			return ResponseFactory.successfulResponse("result", mailResponse);
		}
		else{
			return ResponseFactory.unsuccessfulResponse("Error al enviar el correo");
		}
	}
}
