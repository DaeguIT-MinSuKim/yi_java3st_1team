package yi_java3st_1team.main.login;

import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;



	public class MailService { 
		//gmail 
	   public static boolean gmailSend(String email, String title, String content) {
		   	String host = "smtp.gmail.com";
	        String user = "hothihi5@gmail.com"; 
	        String password = "dlstjs1!";  
	        // SMTP 서버 정보를 설정한다.
	        Properties prop = new Properties();
	        prop.put("mail.smtp.host", "smtp.gmail.com"); 
	        prop.put("mail.smtp.port", 465); 
	        prop.put("mail.smtp.auth", "true"); 
	        prop.put("mail.smtp.ssl.enable", "true"); 
	        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        
	        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(user, password);
	            }
	        });

	        try {
	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(user));

	            //수신자메일주소
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); 

	            // Subject
	            message.setSubject(title); //메일 제목을 입력

	            // Text
	            message.setText(content);    //메일 내용을 입력

	            // send the message
	            Transport.send(message); ////전송
	            return true;
	        } catch (AddressException e) {
	            // TODO Auto-generated catch block
	           JOptionPane.showMessageDialog(null, "메일 전송에 실패하였습니다" + " 원인 : " + e.getMessage());
	           return false;
	        } catch (MessagingException e) {
	            // TODO Auto-generated catch block
	           JOptionPane.showMessageDialog(null, "메일 전송에 실패하였습니다" + " 원인 : " + e.getMessage());
	           return false;
	        }
	   }
	   //naver메일
	    public static boolean naverMailSend(String email, String title, String content) { 
	        String host = "smtp.naver.com"; 
	        String user = "dlstjs8246@naver.com";  
	        String password = "qkrdlstjs1";   
	        Properties props = new Properties(); 
	        props.put("mail.smtp.host", host); 
	        props.put("mail.smtp.port", 587); 
	          props.put("mail.smtp.auth", "true"); 
	          Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() { 
	             protected PasswordAuthentication getPasswordAuthentication() { 
	                return new PasswordAuthentication(user, password); 
	             } 
	          }); 
	          try { 
	             MimeMessage message = new MimeMessage(session); 
	             message.setFrom(new InternetAddress(user)); 
	             message.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); 
	             message.setSubject(title); 
	             message.setText(content);  
	             Transport.send(message); 
	             return true;
	             
	          } catch (MessagingException e) { 
	             JOptionPane.showMessageDialog(null, "메일 전송에 실패하였습니다" + " 원인 : " + e.getMessage());
	             return false;
	          } 
	    }
	}