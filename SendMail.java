import javax.mail.*;
public class SendMail {

	public static void main(String[] args)
	{
		MailSender mail=new MailSender();
		mail.setHost("smtp.gmail.com");
		mail.setFrom("java4students.ducat@gmail.com");
		mail.setPassword("java@ducat");
		
		String to[]={"ssoni7893@gmail.com","animeshdeepak1@gmail.com"};
		mail.setTo(to);
		
		String attach[]={"D:/uploaded/a.png","D:/uploaded/c.jpg"};
		mail.setAttachment(attach);
		mail.setSubject("mail from java program");
		mail.setMsg("hello,Student...");
		mail.send();
		System.out.println("mail send...");
	}
 
}
