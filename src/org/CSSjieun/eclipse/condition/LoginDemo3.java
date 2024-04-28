package org.CSSjieun.eclipse.condition;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing") && password.equals("111111")) { // id가 egoing이고 password가 111111일때, right

			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
