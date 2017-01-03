package com.dhatriinfo.mail;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.logic.GenerateOtp;

public class SendMail 
{
	private static String host="smtp.gmail.com";
	private static String port="25";
	private static final String userName="vinod.dhatriinfo@gmail.com";
	private static final String password="vinod1992";
	public static void sendEmail(Employee empBean) throws AddressException,
            MessagingException {
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
        String message_send="Employee Id = "+empBean.getEmployeeId() +"\n";
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(empBean.getEmail()) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject("Hi " +empBean.getEmployeeName());
        msg.setSentDate(new Date());
        msg.setText(message_send);
       
        
        /*MimeMultipart multipart = new MimeMultipart("related"); 
        BodyPart messageBodyPart = new MimeBodyPart();
         messageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource("C:\\Users\\vinod\\Documents\\year.jpg");
        messageBodyPart.setDataHandler(new DataHandler(fds));
        messageBodyPart.setHeader("Content-ID", "<image>");
        // add image to the multipart
        multipart.addBodyPart(messageBodyPart);
        // put everything together
       msg.setContent(multipart);*/
 
        // sends the e-mail
        Transport.send(msg);  
 
    }
}
