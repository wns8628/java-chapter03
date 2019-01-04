package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] src = {0, 1, 2, 3, 4};
		byte[] dest = null;
		
		//빨때 - 주스트림
		InputStream is = new ByteArrayInputStream(src);
		OutputStream os = new ByteArrayOutputStream(); //예외 내부에 DEST가있다.
		
		int data = -1;
		while((data = is.read()) != -1) {
			os.write(data); //암시적 캐스팅
		}
		
		
		dest = ((ByteArrayOutputStream)os).toByteArray();
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}
}
