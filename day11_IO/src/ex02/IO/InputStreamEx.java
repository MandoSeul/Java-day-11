package ex02.IO;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) {
		System.out.println("input : ");
		int num;
		try {
			num=System.in.read(); // �ݵ�� ����ó�� �ؾ���, �ѹ��� �Է�, '0'~'9' ( ASCII 48~57), return -1 ( ���̻� �Է¹����� ������ )
			System.out.println((char)num); // char�� ��ȯ���ϸ� ascii�� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // read�� return type�� int��
		
//		try {
//			while((num = System.in.read())!= -1){
//				if(num==10||num==32||num==13)	continue; // �ٽ��������ΰ���
//				if(num==113||num==81) break; // �ҹ���'q'�̰ų� 'Q'�̸� ����������
//				//�ƽ�Ű 10 -> LF(�ٹٲ�)
//				//CR -> �ٹٲ� 13
//				//SP- > spacebar 32
//				//113 -> �ҹ��� q
//				//81 -> �빮�� Q
//				char ch=(char)num;
//				System.out.println(ch);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
