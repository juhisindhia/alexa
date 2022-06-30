package com.string;

public class Demo {
	public static void main(String[] args) {
		
		String s = "asfdqwerdfghyuoi";
		
		
		//count vowels
		int count = 0;
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'   ) {
				count++;
			}
		}
		System.out.println("Total no of vowels is : "+count);
	}

}
