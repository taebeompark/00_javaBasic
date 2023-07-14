package edu.kh.baic;

//주석 한줄(컴파일러가 해석되지않는 부분,주로 코드 설명 작성)
/*범위주석*/
//컴파일러: 코드를 2진수(0,1)로 변환하는 번역기
//java 코드실행순서
//코드작성-> ctrl + f11 실행 (컴파일러가 2진수로 번역-> jvm 이실행)
public class javaTest {
	//class: 자바코드가 작성되는 영역
	public static void main(String[] args) {
		//main method(메소드): 자바 애플리케이션(프로그램)을 
		//실행하기위해 반드시필요한 메서드
		//복사할 커서놓고 ctrl + alt +방향키 :해당방향으로 해당줄 복사
		System.out.println("hello world");
		System.out.println("점심을?");
		System.out.println("12345");
		System.out.println("----------------------");
		
		//숫자연산
		System.out.println("1 + 2");
		System.out.println(1 + 2 );
		
		//"" 안에 작성된 코드는 단순문자열 인식
		//"" 안에 작성되지 않은 코드는 숫자,변수로 인식
		System.out.println(1 + 2 );
		
		//""(문자열) + 숫자함께 작성
		System.out.println("14*15=" + 266);
		System.out.println("14*19=" + 14*19);
		
		System.out.println("90 + 70 +65 = " + 90 + 70+ 60);
		
		//자바는 사칙연상의 우선순위를 그대로 따른다
		//우선 계산을 원하면 ( ) 활용
		
		
		//기호의 역할
		//->숫자 + 숫자 = 덧샘 연산결과
		//-> 문자열 + 숫자  or
		//문자열 + 문자열 -> 이어쓰기
	}
}
