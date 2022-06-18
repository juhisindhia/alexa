package com.loops;
/*
public class Sum {
	public static void main(String[] args) {
		int i = 2;
		int j = 5;
		int k = i + j;
		System.out.println(k);
	}

}*/

class Sum {
	public static void main(String[] args) {
		Sum s1 = new Sum();
		int add = s1.calculation(1, 2, "+");
		int sub = s1.calculation(5, 2, "-");
		int mul = s1.calculation(7, 2, "*");
		int div = s1.calculation(7, 2, "/");
		int per = s1.calculation(7, 2, "%");
		System.out.println("Addition : " +add);
		System.out.println("Subtraction :" +sub);
		System.out.println("Multiplication "+ mul);
		System.out.println("Division : "+div);
		System.out.println("default : "+ per);
	}

	// method
	public int calculation(int a, int b, String action) {
		int result = -1000;
		/*
		 * if (action.equals("+")) { // addition result = a + b; } else if
		 * (action.equals("-")) { // subtraction result = a - b; } else if
		 * (action.equals("*")) { // multiplication result = a * b; } else if
		 * (action.equals("/")) { // division result = a / b; }
		 */

		switch (action) {
		case "+":result = a + b; break;
		case "-":result = a - b; break;
		case "*":result = a * b; break;
		case "/":result = a / b; break;
		default : result = -1;
		}

		return result;
	}

}
