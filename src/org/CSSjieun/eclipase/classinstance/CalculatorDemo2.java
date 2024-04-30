package org.CSSjieun.eclipase.classinstance;

class Calculator2 {
	
	static double PI = 3.14;
	// class 변수인 base가 추가 되었다.
	static int base = 0; // static이 붙어있기 때문에 base는 Calculator2 라는 class의 변수가 된다.
	int left, right; // instance의 멤버이고, instance마다 다른 값을 가지게 된다.
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		c2.sum();
		
		// 클래스 변수 base의 값을 10으로 지정했다.
		Calculator2.base = 10;
		
		c1.sum();
		
		c2.sum();

	}

}
