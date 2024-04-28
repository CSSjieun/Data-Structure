package org.CSSjieun.eclipse.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
		if(i == 5) // i == 5면 skip
		   continue;
		System.out.println("Coding Everybody" + i);
		}
	}

}
