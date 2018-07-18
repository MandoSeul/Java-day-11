package ex05.Binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
		public static void main(String[] args) {
			File src = new File("C:/Windows/explorer.exe");//절대경로 - 복사원본
			File dist = new File("D:/javaapp/workspace/explorer.bin");//절대경로 - 복제될 위치
			int count;
			FileInputStream fin = null;
			FileOutputStream fos = null;
			BufferedInputStream bin = null;
			BufferedOutputStream bos = null;
			
			try {
				fin = new FileInputStream(src); // 파일 입력 바이트 스트림 연결
				fos = new FileOutputStream(dist);// 파일 출력 바이트 스트림 연결
				bin = new BufferedInputStream(fin);//버퍼 입력스트림 연결
				bos = new BufferedOutputStream(fos); // 버퍼출력스트림 연결
				
				while((count = bin.read())!=1){
					bos.write((char)count);
				}//end while
				
				System.out.println("파일 복사 성공");
				bin.close(); 
				bos.close();
				fin.close();
				fos.close();
			} catch (Exception e) {
				System.out.println("파일 복사 오류 발생~!~!~!");
			}
		}

}
