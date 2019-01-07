package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("File Not Found");
				return;
			}
			
			System.out.println("=====파일정보=======");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length()+"bytes");
			Date d = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println(sdf.format(d)); 			
			//한줄로
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));			
			System.out.println("======전화번호=========");
			
			//기반스트림(byte)
			FileInputStream fis = new FileInputStream(file); //스트림말고 파일객체넣어줘도됨
															 //파일리더 써도됨 키보드랑같게할려구한거
//	     	  												 FileReader fis = new FileReader(file);
						
			//보조스트림1(bytes -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //파일리더쓰면이거안써도됨
			
			//보조스트림2(라인입력)
			br = new BufferedReader(isr);
			
			//처리 
			String line;
			while((line= br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t ");
				
				int index = 0;
				while(st.hasMoreElements()==true) {//분리가 됐냐? 
					String token = st.nextToken();
					
					if(index == 0) {  //이름
						System.out.print(token);
						System.out.print(": ");			
					} else if( index ==1) { //번호1
						System.out.print(token);
						System.out.print("-");				
					} else if( index ==2) { //번호1
						System.out.print(token);
						System.out.print("-");				
					} else {
						System.out.print(token);
					}
					index++;
				}
				System.out.println("");
			}
			
		} catch(IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
