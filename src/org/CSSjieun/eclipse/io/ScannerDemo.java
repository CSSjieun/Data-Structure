package org.CSSjieun.eclipse.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in 사용자가 키보드를 통해서 입력한 값
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();

	}

}
