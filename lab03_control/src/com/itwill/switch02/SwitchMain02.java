package com.itwill.switch02;

import java.util.Random;

public class SwitchMain02 {

	public static void main(String[] args) {
		// Random 타입의 변수를 선언하고 초기화. 
		Random rand = new Random();
		
		// 정수 타입의 변수에 1부터 4까지 
		int code = rand.nextInt(1, 5); // 1 이상 5 미만의 난수 
		System.out.println("code = " + code);
		
		switch (code) {
		case 1:
		case 3:
			System.out.println("남자"); // 출력 같이하고 break 한번만 걸어도 됨.
			break;
		case 2:
		case 4:
			System.out.println("여자");	
			

			
			
		}
		
	}

}
	
