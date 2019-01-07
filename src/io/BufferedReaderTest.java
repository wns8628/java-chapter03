package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null; //라인단위로
		
		try {
			 //기반 스트림 
			 //추상써도되는데 걍 이름익히라고 
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
			br = new BufferedReader(fr);
			
			//input
			//이건 캐릭터단위로 읽을 필요가없다
			int index = 0;
			String line = null;
			while((line = br.readLine())!= null) {
				index++;
				System.out.print(index + ":");
				System.out.print(line);
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found" + e); 
		} catch (IOException e) {
			System.out.println("error : " + e); 
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
