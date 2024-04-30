package org.CSSjieun.eclipse.method;

public class MethodDemo1 {

	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

	}
	
	public static void main(String[] args) {
		numbering();// 호출1
		numbering();// 호출2
		numbering();// 호출3

	} // 정의
} 

