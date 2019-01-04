package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {

		Reader in = null; //문자단위
		InputStream is = null; //바이트단위
		
		try {
		   in = new FileReader("123.txt");
		   
		    int count = 0; //몇번읽는지
			int data = -1; 			
			//
			while((data = in.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			//
			
			System.out.println();
			System.out.println("count : " + count);
			
		
System.out.println("=================================");
					
			is = new FileInputStream("123.txt");   
		    count = 0;
		    //
			while((data = is.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			//
			
			System.out.println();
			System.out.println("count : " + count);
		
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다 :" + e);
		} catch(IOException e) {
			System.out.println("입출력 오류" + e);
		}finally {
				try {
					if(in != null) {	
					   in.close();
					}
					if(is != null) {	
					   is.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}				
		}

}
