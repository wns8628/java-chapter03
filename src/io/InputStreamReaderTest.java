package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		
		//인코딩 실습 ===============================================================
		
		
		InputStreamReader isr = null;
				
		try {
			//기반스트림
			FileInputStream fis = new FileInputStream("ms949.txt");
			//보조스트림
			isr = new InputStreamReader(fis, "Ms949"); //하나씩읽는데 ms949로 인코딩하겠다.
			
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data); //데이터를 캐릭터로 바꾸는것
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found : " + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Encoding : " + e);
		} catch (IOException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if(isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
