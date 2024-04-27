package org.CSSjieun.eclipse.Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		Iterator it = numbers.iterator(); // 반복문, it = iterator data type (Interface)
		System.out.println("iterator");
		while(it.hasNext()){
		    int value = (int)it.next();
		    if(value == 30){
		        it.remove();
		}
		System.out.println(value);
	}
	System.out.println(numbers);
	
	System.out.println("\nfor each");
	for(int value : numbers) {
		System.out.println(value);
	}
	System.out.println(numbers);
	
	System.out.println("\nfor");
	for(int i = 0; i<numbers.size(); i++){
		System.out.println(numbers.get(i));
	}
}
	
}


