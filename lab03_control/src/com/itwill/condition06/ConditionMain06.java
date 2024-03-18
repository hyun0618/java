package com.itwill.condition06;

public class ConditionMain06 {

	public static void main(String[] args) {
		// 삼항 연산자 연습
		
		// 1. 변수 number가 짝수인지, 홀수인지를 저장하는 변수 evenOrOdd:
		int number = 123;
		String evenOrOdd = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println(evenOrOdd);
	}

}
