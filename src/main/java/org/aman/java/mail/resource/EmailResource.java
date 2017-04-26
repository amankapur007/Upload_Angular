package org.aman.java.mail.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.aman.java.mail.model.EmailModel;
import org.aman.java.mail.service.EmailService;

@Path("/Email")
public class EmailResource {
	
	EmailService es = new EmailService();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EmailModel sendEmail(EmailModel message){
		return es.sendMessage(message);
	}
}
