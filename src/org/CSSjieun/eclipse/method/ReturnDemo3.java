package org.CSSjieun.eclipse.method;

public class ReturnDemo3 {
	
	public static String getMember() {
		return "최진혁";
	}
	
	public static String getMember2() {
		return "최유빈";
	}
	
	public static String getMember3() {
		return "한이람";
	}

	public static void main(String[] args) {
		// 복수의 리턴
		System.out.println(getMember());
		System.out.println(getMember2());
		System.out.println(getMember3());

	}

}
