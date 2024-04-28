package org.CSSjieun.eclipse.Operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10; // 정수
		int b = 3; // 정수
		
		float c = 10.0F; // 실수
		float d = 3.0F; // 실수
		
		System.out.println(a/b); // 3
		System.out.println(c/d); // 3.33333
		System.out.println(a/d); // 3.33333 (정수/실수) => a와 d를 더 광범위한 타입으로 (조밀한) 형변환. 정수 -> 실수

	}

}
