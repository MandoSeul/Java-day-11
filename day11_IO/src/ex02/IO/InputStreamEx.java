package ex02.IO;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) {
		System.out.println("input : ");
		int num;
		try {
			num=System.in.read(); // 반드시 예외처리 해야함, 한문자 입력, '0'~'9' ( ASCII 48~57), return -1 ( 더이상 입력받을게 없으면 )
			System.out.println((char)num); // char로 변환안하면 ascii로 나옴
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // read의 return type은 int형
		
//		try {
//			while((num = System.in.read())!= -1){
//				if(num==10||num==32||num==13)	continue; // 다시조건으로간다
//				if(num==113||num==81) break; // 소문자'q'이거나 'Q'이면 빠져나가기
//				//아스키 10 -> LF(줄바꿈)
//				//CR -> 줄바꿈 13
//				//SP- > spacebar 32
//				//113 -> 소문자 q
//				//81 -> 대문자 Q
//				char ch=(char)num;
//				System.out.println(ch);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
