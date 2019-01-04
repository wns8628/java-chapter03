package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
				
		//정식 
		try {
			is = new FileInputStream("my.jpg");         //빨떄꼽음
			os = new FileOutputStream("my.copy.jpg");   //빨떄꼽음
			
			int data = -1; 
			while((data = is.read()) != -1) {
				os.write(data); //암시적 캐스팅 //int니깐?
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이없십니다. : " + e);
		}catch(IOException e) {	
			System.out.println("입출력 에러:" + e);
		} finally {
			//자원정리 
			try {
				
				if(is != null) { //자원정리
					is.close();		
				}
				if(os != null) { //자원정리
					os.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
