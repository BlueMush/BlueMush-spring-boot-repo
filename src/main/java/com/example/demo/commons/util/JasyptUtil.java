package com.example.demo.commons.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

/**
 * Jasypt encryption/decryption util
 * @author gchyoo
 *
 */
public class JasyptUtil {
	private static StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
	private String key = "";
	
	public JasyptUtil(String key) {
		this.key = key;
	}
	
	public String encrypt(String pwd) {;
		try {
			pbeEnc.setAlgorithm("PBEWithMD5AndDES");
			pbeEnc.setIvGenerator(new RandomIvGenerator());
			pbeEnc.setPassword(key);
		} catch(Exception ex) {
			
		}
		String password = pbeEnc.encrypt(pwd);
		
		return password;
	}
	
	public String decrypt(String pwd) {
		try {
			pbeEnc.setAlgorithm("PBEWithMD5AndDES");
			pbeEnc.setPassword(key);
		} catch(Exception ex) {
			
		}
		String password = pbeEnc.decrypt(pwd);

		return password;
	}
	
	/**
	 * 
	 * @param args
	 * Click right mouse button > Run As > Run Configurations > Arguments > Program Arguments > insert key value
	 */
	public static void main(String[] args) {
		String key = args[0].replaceAll(" ", "");
		
		JasyptUtil jasyptUtil = new JasyptUtil(key);
		
		String pwd = jasyptUtil.encrypt("암호화할 값");
		
		System.out.println("encrypted : " + pwd);

		pwd = jasyptUtil.decrypt(pwd);
		
		System.out.println("decrypted : " + pwd);
	}
}