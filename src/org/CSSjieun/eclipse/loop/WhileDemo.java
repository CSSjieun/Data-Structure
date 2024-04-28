package org.CSSjieun.eclipse.loop;

public class WhileDemo {

	public static void main(String[] args) {
		int n = 0; // 초기값 n = 0
		
		while(n < 3) {
			System.out.println("Coding Everybody"+n);
			
			n++;
		}
		// n의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문은 반복문을 재호출한다. 이때 i<10의 값을 검사하게 된다.
		
	}

}
