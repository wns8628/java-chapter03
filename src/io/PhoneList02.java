package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneList02 {

	public static void main(String[] args) {
		
		//스캐너의 편리성! 
		Scanner scanner = null;
		
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
			scanner = new Scanner(file);

			while(scanner.hasNextLine()) {//라인단위 
				String name = scanner.next();
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();
				
				System.out.println(name + ": " + phone01 + "-" + phone02 +"-" +phone03);
			}
			
		} catch(IOException e) {
			System.out.println("Error:" + e);
		} finally {
			if(scanner !=null) {
				scanner.close();
			}
		}
	}

}
