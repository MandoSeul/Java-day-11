package ex06.prac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Vector;

public class StudentClass extends PersonClass {
	Scanner sc = new Scanner(System.in);
	Vector vec = new Vector();
	private String major = " 전공 : ",uniage=" 학번 : ", grade=" 학년 : ", score=" 점수 : ";
	String str, tep ="\r\n" ;
	int num=0;
	public StudentClass() throws FileNotFoundException  {
		OutputStream os = new FileOutputStream("C:/Users/PBL-14/person.txt",true);
		System.out.println("등록할 학생수는 몇명입니까?");
		num = sc.nextInt(); sc.nextLine();
		for(int i=0; i<num; i++){
			System.out.println("이름 나이 성별 학과 학번 학년 점수를 입력하세요 : ");
			vec.add(name+sc.next()+age+sc.next()+man+sc.next()+major+sc.next()+uniage+sc.next()+grade+sc.next()+score+sc.next()+tep);
			try {
				os.write(((String) vec.get(i)).getBytes());
				System.out.println("파일에 등록되었습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}
