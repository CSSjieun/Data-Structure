package org.CSSjieun.eclipse.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 6) // if 문 뒤에 반복문이 한줄이면 {} 중괄호를 생략할 수 있다. 
				break;
			System.out.println("Coding Everybody" + i);
		}

	}

}
