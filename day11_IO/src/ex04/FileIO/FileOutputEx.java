package ex04.FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Vector;

public class FileOutputEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		OutputStream os = new FileOutputStream("C:/Users/PBL-14/hello.txt",true); // append 모드
		String name, dep, pos;
	System.out.println("몇 명을 등록하시겠습니까?");
	int num = sc.nextInt(); sc.nextLine();
		for(int i=0; i<num; i++){
				System.out.println("이름 직급 부서를 입력하세요..");

				name = "사원이름 : "+ sc.next()+ "\t"; dep = "사원의 직급 : "+ sc.next()+ "\t"; 
				pos = "사원부서 : "+sc.next()+ "\t\n";

				os.write(name.getBytes()); 
				os.write(dep.getBytes());
				os.write(pos.getBytes());
	
			}
		os.close();
}
}
