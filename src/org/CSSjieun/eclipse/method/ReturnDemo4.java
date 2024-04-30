package org.CSSjieun.eclipse.method;

public class ReturnDemo4 {
	
	public static String[] getMembers() { // getMembers()의 return값이 String문자열의 리턴값을 담을 수 있는 배
		String[] members = {"최진혁", "최유빈", "한이람"};
		return members;
	}

	public static void main(String[] args) {
		// 배열을 이용한 코드
		String[] members = getMembers();
		System.out.println(members[0]);
	}

}
