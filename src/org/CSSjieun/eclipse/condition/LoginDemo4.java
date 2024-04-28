package org.CSSjieun.eclipse.condition;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
			&& password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}

// 입력한 id 중에 egoing k8805 sorialgi 중 하나라도 있으면 + password가 111111이면 right
