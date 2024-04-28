package org.CSSjieun.eclipse.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		
		// switch(1)이면 case 1 포함 그 뒤에 결과값들이 출력된다.
		// switch(2)이면 case 2와 case 3이 실행된다.
		// break; 를 한다면 switch()안의 값만 출력된다. 
		// switch()안에 있는 조건이 어디에도 없다면 default가 실행된다.
		
		int val = 1;
		if(val == 1) {
			System.out.println("one");
		} else if(val == 2) {
			System.out.println("two");
		} else if (val == 3) {
			System.out.println("three");
		}
		
	}

}


