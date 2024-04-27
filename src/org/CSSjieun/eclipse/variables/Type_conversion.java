package org.CSSjieun.eclipse.variables;

public class Type_conversion {

	public static void main(String[] args) {
		double a = 3.0F; // float에서 double로 형 변환이 일어나도 데이터 손실이 일어나지 않음 
		
		System.out.println(a);
		
	    int d = 1;
	    float b = 1.0F;
	    double c = b + d;
	    // float = b + d;
	    
	    System.out.println(c);
	    
	    float e = (float)100.0;
	    int f = (int)100.0F;
	    
	    System.out.println(e + f);

	}

}
