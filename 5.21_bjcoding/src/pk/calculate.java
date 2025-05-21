package pk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class calculate {
	public static void main(String[] args) {
		
		int num1, num2;
		// System.in 시스템 내부로 인식받겠다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.printf("%d ? %d = ?에 들어갈 기호를 넣으세요(+,-,*,/,)%n", num1, num2);
		String etc = sc.next();
		if(etc.equals("+")) {
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		}else if(etc.equals("-")) {
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		}else if(etc.equals("*")) {
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		}else if(etc.equals("/")) {
			System.out.printf("%d - %d = %d", num1, num2, num1/num2);
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		// switch 복기
//		switch(etc) {
//			case("+"): 
//				System.out.printf("%d + %d = %d", num1, num2, num1+num2);
//			break;
//			case("-"): 
//				System.out.printf("%d - %d = %d", num1, num2, num1-num2);
//			break;
//			case("*"): 
//				System.out.printf("%d + %d = %d", num1, num2, num1*num2);
//			break;
//			case("/"): 
//				System.out.printf("%d + %d = %d", num1, num2, num1/num2);
//			break;
//			default:
//				System.out.println("잘못된 입력입니다.");
//			break;
//		}
		// sc 미리 닫지 말것. 뒤의 버퍼에서 오류 뜬다.
//		sc.close();
		// system.in은 바이트라 문자(char)로 바꿔줘야함.InputStreamReader가 문자로 바꾸는 역.
		// int같은 숫자도 입력받긴하지만 문자열로 받기때문에 받고 integer 숫자로 변환해야함
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(bf);
		String bf_test;
		try {
			System.out.println("버퍼 테스트 아무거나 입력");
			// 트라이 캐치나 뜨로 예외처리 해줘야함.
			bf_test = bf.readLine();
			System.out.println("버퍼로 불러들인것" + bf_test);
			bf.close();
		} catch (IOException e) {
			System.out.println("실패");
		}
		sc.close();
	}
	
}
