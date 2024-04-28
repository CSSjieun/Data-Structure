package org.CSSjieun.eclipse.Operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i++; // i = i + 1; 4;
		System.out.println(i); // 4;
		++i;
		System.out.println(i); // 5;
		
		System.out.println(++i); // 6;
		System.out.println(i); // 6;
		
		System.out.println(i++); //6; (i++)는 이 다음부터 +1된 값을 반환한다. 
		System.out.println(i); //7;
		
		int a = 4-3*6;
		int b = (4-3)*6;
		System.out.println(a);
		System.out.println(b);

	}

}
