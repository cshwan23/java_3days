


	package com.daum.erp;

	public class Test_03 {
 
		public static void main(String[] args) {
	
	//암시적 형변환 코딩 연습.		
			
//<문제1>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int num1 = 5;
		int num2 = 2;
		double num3 = num1 / num2;
		             //1) 2.5가 맞지만 정수형이였기때문에 => 2
				     //2) 더블형으로 형변환 => 2.0
		
		System.out.println("numb3 => " + num3 );
		
/*<문제>
		 num3에 2.0이 저장되는 이유?	 
  <정답> 
		 (****자료형 우선순위)
		 => num1/num2 연산결과인 int형 2가 double형 변수에 저장되므로 
		 2 -> 2.0으로 형 변환이 된다.
		 => 데이터 끼리 연산시 자료형이 서로 틀리면 한쪽이 다른 쪽에 맞춰 자료형이 변환되고, 
		 	데이터를 변수에 저장할 경우에도 데이터가 변수의 자료형으로 변환된다.
		 */
		
//<문제2>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		int num4 = 5;
		double num5 = 2.0;
		double num6 = num4 / num5;
		System.out.println("num6 => " + num6 );
		
		/* 
		5.0 / 2.0
		형변환은 나눌 때 일어난다.
		*/
		
		/*
		 집요하게 끝까지 집중하는게 중요하다. 
		 <문제>
		 암시적 형변환은 언제 일어나나?
		 <정답>
		 num4 / num5 의 자료형을 double로 나눌때 암시적 형 변환 발생.
		 */
		
		
		//캐스트 연산자
//<문제3>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		int num7 = 5;
		int num8 = 2;
		double num9 = (double)num7/num8;
		System.out.println("num9 => " + num9 );
		
		/* <나의 정답>
		5.0/2.0
		= 2.5
		*/
		
		// 변수 num9에 2.5 저장
		// (double)은 num7만 잡고 흔드는거다. 
		// num7이 5.0 으로 변환시킨다 (명시적 형변환)
		// num8 도  num7에 따라 double형으로 변환된다.(암시적 형변환)
		//(double)을 cast 연산자라고 부른다.
		
//<문제4>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//**************중요*** 캐스트 연산자 역할****
	double num10 = 5;
	int num11 = 2;
	double num12 = (int)num10/num11;
	System.out.println("num12 => " + num12 );
	
//	5.0 -> 5 로 거꾸로 바꿀수 있다?
//		5/2
//		2
// 		2.0
	//cast 연산자는 우선순위를 바꿔버리는 거다.
	//cast 연산자는 개발자가 명시적으로 특정목적하에 실수를 정수로 바꿀수 있다.
	//cast연산자는 명시적 연산자기때문에.
		
//<문제5>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	int num13 = 5;
	int num14 = 2;
	double num15 = (double)(num13/num14);
	System.out.println("num15 => " + num15 );
	
	/*
	 5/2
	 2
	 2.0
	 */
	//(double)은 num13을 변환시키지 않고
	//num13/num14의 결과값을 변환시킨다(명시적변환)
	
	
	
	
		
		
		
		
	}

}
