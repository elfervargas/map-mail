package mx.org.inegi.geo.mail.model;

import java.util.List;

public class MailRequest {
	private String project;
	private List<String> eMails;
	private String subject;
	private String body;

	public MailRequest(String project, String subject, String body) {
		super();
		this.project = project;
		this.subject = subject;
		this.body = body;
	}

	public MailRequest() {
		super();
	}

	public String getProject() {
		return project;
	}

	public void setProject(String proyect) {
		this.project = proyect;
	}

	public List<String> geteMails() {
		return eMails;
	}

	public void seteMails(List<String> eMails) {
		this.eMails = eMails;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
