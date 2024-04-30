package org.CSSjieun.eclipse.method;

import java.io.*; // 무시

public class MethodDemo7 {
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		try {
			// 무시
			// 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
			
		} catch (IOException e) {
			// 무시
		}
	}

}
