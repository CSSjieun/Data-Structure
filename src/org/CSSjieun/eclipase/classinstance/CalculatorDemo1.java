package org.CSSjieun.eclipase.classinstance;

class Calculator{
	
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo1 {
	
	

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); // Class의 변수에 접근하기 위해서 instance의 변수를 이용하는 방법
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI); // Class의 변수의 접근하기 위해서는 Class 자체를 이요할 수도 있다.

	}

}
