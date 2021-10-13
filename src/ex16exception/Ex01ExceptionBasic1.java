package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1
{

	public static void main(String[] args) throws IOException
	{
		/*
		Syntax에러(구문에로, 문법에러)
			:실행자체가 안되는 코드로 오류를 수정해야만 정상적으로
			실행된다. 즉 코드에 문법적인 오류가 발생되었음을 의미한다.
		 */
		// -> int를 Int로 표기했음
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		/*
		외부자원을 사용할떄 발생되는 예외
		처리방법1] main() 메서드 밖으로 예외를 던진다. 이것을 "예외던지기"라고
		표현하고, 내부에서 예외를 처리하지 않고 무시하겠다는 의미이다.
		이 경우 main() throws IOException 처럼 작성하면 된다.
		 */
		System.out.println("문자하나를 입력하세요:");

		int iChar = System.in.read();
	}

}