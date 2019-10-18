package ITSupportAdmin;
import java.util.Random;


public class EmailIdGenerator {

	private String emailid;
	private final String mailboxcapacity="5GB";
	
	public String getMailboxcapacity() {
		return mailboxcapacity;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String EmailGenerator(String firstname,String lastname,String department){
		Random random=new Random();
		int number=random.nextInt(1000);
		String randoms=String.format("0%3d",number);
		emailid=firstname.toLowerCase()+lastname.toLowerCase()+randoms+"@"+department.toLowerCase()+"company.com";
		return emailid;
	}
	
}
