package ITSupportAdmin;

import java.util.Scanner;

public class ITSupportAdmin {

	public static void main(String[] args) {
		NewHires newhires=new NewHires();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter firstname:");
		String firstname=scanner.nextLine();
		newhires.setFirstname(firstname);
		System.out.println("Enter lastname:");
		String lastname=scanner.nextLine();
		newhires.setLastname(lastname);
		System.out.println("Enter department:");
		String department=scanner.nextLine();
		newhires.setDepartment(department);
		EmailIdGenerator email=new EmailIdGenerator();
		String emailid=email.EmailGenerator(firstname,lastname,department);
		email.setEmailid(emailid);
		PasswordGenerator pg=new PasswordGenerator();
		String password=pg.generatepassword();
		pg.setPassword(password);
		System.out.println("-------------------------------------------------------------");
		System.out.println("New hire details are:");
		System.out.println("Firstname:"+newhires.getFirstname());
		System.out.println("Lastname is:"+newhires.getLastname());
		System.out.println("Deartment is:"+newhires.getDepartment());
		System.out.println("Email id is:"+email.getEmailid());
		System.out.println("Mailbox capacity is:"+email.getMailboxcapacity());
		System.out.println("Default password is:"+pg.getPassword());
		System.out.println("-------------------------------------------------------------");
		System.out.println("Want to change password? Type yes to change");
		String choice=scanner.nextLine();
		if(choice.equals("yes")){
			System.out.println("-------------------------------------------------------------");
			System.out.println("Enter new password:");
			String newpassword=scanner.nextLine();
			System.out.println("Retype password");
			String retypepassword=scanner.nextLine();
			if(newpassword.equals(retypepassword)){
			pg.setPassword(newpassword);
			System.out.println("Password changed successfully");
			System.out.println("-------------------------------------------------------------");
			}
			else
				System.out.println("Couldn't change password");
		}
		else{
			System.out.println("Invalid input");
		}
	}

}
