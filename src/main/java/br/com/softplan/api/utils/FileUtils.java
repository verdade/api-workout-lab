package br.com.softplan.api.utils;

import java.io.InputStreamReader;
import java.util.Locale;

import org.springframework.web.multipart.MultipartFile;

public final class FileUtils {

	public static Locale locale = new Locale("pt-br");

	public static boolean isPDF(MultipartFile multipartFile) throws Exception {
		boolean result = false;
		try {
			try (InputStreamReader ir = new InputStreamReader(multipartFile.getInputStream())) {
	            char[] preamble = new char[4];
	            ir.read(preamble, 0, 4);
	            result =  new String(preamble).equals("%PDF");
	        }
		} catch (Exception ex) {
			result = false;
			throw new Exception(ex.getMessage(), ex);
		} 
		return result;
	}
	
}