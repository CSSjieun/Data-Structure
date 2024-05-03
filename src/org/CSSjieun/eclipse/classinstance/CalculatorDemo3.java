package org.CSSjieun.eclipse.classinstance;

class Calculator3 {
	
	public static void sum(int left, int right) { // static을 달면 sum은 class 소속의 메소드가 된다.
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		Calculator3.sum(10, 20); // Class를 직접 사용
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}

}
