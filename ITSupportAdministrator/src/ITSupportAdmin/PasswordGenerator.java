package ITSupportAdmin;

import java.util.Random;

public class PasswordGenerator {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String generatepassword(){
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < 12) { 
            int index = (int) (rnd.nextFloat() * chars.length());
            sb.append(chars.charAt(index));
        }
        String password = sb.toString();
        return password;
	}
	
}
