package Encoding;

import org.apache.commons.codec.binary.Base64;

public class Encoded {

	public static void main(String[] args) {
		
		String str="test@123";
	byte[] encodedata=	Base64.encodeBase64(str.getBytes());
	System.out.println("encoded string is"+" "+new String(encodedata));
	byte[] decodedata=	Base64.decodeBase64(encodedata);
	System.out.println("decode string is"+" "+new String(decodedata));	
	
	}

}
