package org.CSSjieun.eclipse.object;

public class CalculatorDemo2 {

	public static void sum(int left, int right) {
		// 중복을 제거한 코드
		// Refactoring
		System.out.println(left + right);

	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	}

}
