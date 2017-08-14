package mx.org.inegi.geo.mail.model;

public class MailResponse {

	private String message ="OK";
	private boolean status = true;

	public MailResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}

	public MailResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
