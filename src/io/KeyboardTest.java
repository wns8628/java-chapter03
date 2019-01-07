package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		//키보드 보조스트림 2개 로 해보자 	
		// 키보드 <-> system.in <->   InputStreamReader <-> BufferdReader 
		
		//스캐너로 대신할수있지만 구체적으로하는거임 
		
		BufferedReader br = null;
	
		try {
			//기반스트림(안만들어도됨 왜냐 표준입력, system.in) 만들어져있지 
		
			//보조스트림1
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			
			//보조스트림2 (char|char|char....|\n -> "charcharchar") <버퍼드임
			br = new BufferedReader(isr);
			
			//read
			String line = null;
			while((line = br.readLine()) != null) {
				if("exit".equals(line)) {
					break;
				}
				System.out.println(">>" + line);
			}			
		} catch (IOException e) {
			System.out.println("Error:"+e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}			
	}

}
