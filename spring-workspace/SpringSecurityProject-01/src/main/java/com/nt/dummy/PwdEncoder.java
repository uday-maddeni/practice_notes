package com.nt.dummy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PwdEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String s1 = encoder.encode("rani");
		String s2 = encoder.encode("hyd");
		String s3 = encoder.encode("mbnr");
		String s4 = encoder.encode("sec");
		
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
	}

}
