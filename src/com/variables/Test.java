package com.variables;

import com.loops.TestLoop;

public class Test {	
	//entry point
	public static void main(String[] args) {
		
		TestLoop lp = new TestLoop();
		String s = lp.printMe();
		System.out.println(s);
		System.out.println(lp.printMe());
	}
}




