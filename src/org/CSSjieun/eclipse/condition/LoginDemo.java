package org.CSSjieun.eclipse.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0]; // 입력값
		if(id.equals("egoing")) { // 문자열 비교연산자 .equals
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
