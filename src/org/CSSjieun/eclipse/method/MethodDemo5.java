package org.CSSjieun.eclipse.method;

public class MethodDemo5 {
	
	public static void numbering(int init, int limit) {
		for(int i = init; i < limit; i++) { // 입력값 시작 숫자를 init의 매개변수로 설
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		numbering(30, 35);

	}

}
