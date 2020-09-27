package elearning;

import java.util.Random;

public class RegexGenerator {
	
	 String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
	 //String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	 
	protected String getRegex(int limit) {
       
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < limit) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}
