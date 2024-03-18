package com.itwill.switch01;

public class SwitchMain01 {

	public static void main(String[] args) {
		// switch-case 구문: 
		// 해당 case 위치로 이동해서 break; 문장을 만날 때까지 실행.
		// 해당되는 case 없으면 default 블록을 실행.
		// default 블록은 switch 구문에서 항상 가장 마지막에 작성.
		// default 블록은 없어도 된다.
		
		String season = "겨울"; // String: 변수타입, season: 변수이름
		switch (season) { // season에 저장 되어있는 문자열 중 봄을 찾아감.
		case "봄": // :의 의미 -> label
			System.out.println("Spring");
			break; 
		case "여름":
			System.out.println("Summer");
			break;
		case "가을": // 실행 문장이 아니므로 ;(세미콜론)이 아니라 :(콜론)이다.
			System.out.println("fall");
			break;
		case "겨울":
			System.out.println("winter");
			break; // ctrl + / ->  그 줄을 주석으로 만듦 
		default: // default는 필수 아니다.
			System.out.println("none");
		
		}
		

	}

}
