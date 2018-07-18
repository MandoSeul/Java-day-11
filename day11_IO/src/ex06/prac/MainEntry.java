package ex06.prac;

import java.io.IOException;

public class MainEntry {
	public static void main(String[] args) {
		try {
			StudentClass stu = new StudentClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
