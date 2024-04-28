package org.CSSjieun.eclipse.compare;

public class EqualString {

	public static void main(String[] args) {
		String a = "Hello World";
		String b = new String("Hello World");
		
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // .equals는 문자열을 비교할 때 사용하는 메소드다.

	}

}
