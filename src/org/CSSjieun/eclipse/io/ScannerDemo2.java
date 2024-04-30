package org.CSSjieun.eclipse.io;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { // while 반복문이 추가됨, int 숫자라면 true 아니면 false
			
			System.out.println(sc.nextInt()*10);
		}
		// false가 되면 while구문에서 나와서 종료가 된다.
		
		sc.close();

	}

}
