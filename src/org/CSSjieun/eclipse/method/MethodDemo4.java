package org.CSSjieun.eclipse.method;

public class MethodDemo4 {

	public static void numbering(int limit) { // int limit: parameter 매개변수 (입력값 수용을 위해서)
		for(int i = 0; i < limit; i++) {
			System.out.println(i);
		}
		
		int n = 0;
		while(n < limit) {
			System.out.println(n);
			n++;
		}

	}
	
	public static void main(String[] arg) {
		numbering(2); // numbering이라는 mehtod를 통해서 input(입력값)을 주고 있는 것이다.)
		// numbering()안에 숫자를 입력하면 limit에 값이 입력된다. (이부분만 가변적)
		// ()안에 숫자는 인자 (argument)
		
	}

}
