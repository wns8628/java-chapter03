package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		//보조스트림 실습
		
		
		BufferedOutputStream bos = null; 
		
		try {
			//1.일단 기반스트림=주스트림 (소스에연결)
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조스트림 (기반스트림에 연결)
			bos = new BufferedOutputStream(fos);  //상속이아니라 이렇게 런타임때 확장함
					
			
			//output
			for(int i='a'; i<='z'; i++) { //아스키코드 상  97 ~ 122
				bos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e); //파일을열수없다
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {
					bos.close();     //보조스트림만 닫아주면 다닫힌다 - 당연하지 생각해봐라
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
	}

}
