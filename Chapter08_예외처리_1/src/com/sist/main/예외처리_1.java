package com.sist.main;
/*
 * 	=> 예외 처리
 * 		=> 최적화 : 실행 속도가 빨라짐
 * 		=> 가독성 : 보기 편하고 => 쉽게 만들어줌
 * 		=> 견고성 : 프로그램이 비정상 종료가 되지 않게 만들어줌
 * 			=> 예외 처리 (에러를 사전에 방지한다 => 비정상 종료를 방지한다)
 * 	
 * 	=> 자바
 * 		=> 에러	==> 수정이 불가능한 에러(메모리 부족, 스레드 충돌)
 * 		=> 예외 처리	==> 소스 상에서 수정이 가능한 에러 (파일 명이 다르거나, URL 주소 오류 등, ...)
 * 		에러가 발생하는 요소
 * 		-------------------
 * 		1.	사용자의 입력 부주의 : 잘못된 입력이 있는 경우
 * 		   	------------------ if 조건문 처리 ==> 유효성 검사
 * 		2.	프로그래머의 실수 : 배열의 범위를 초과하거나, 반복 수행, 클래스 메모리가 할당되지 않은 경우, 변수 초기화가 되지 않은 경우, 등..
 * 
 * 	=> 예외 처리
 * 		=> 사전에 에러 방지
 * 		=> 비정상 종료를 방지하고 ==> 정상 상태 유지
 * 		=> 예외 처리, 에러 발생시 에러 부분을 건너뛴다.
 * 		   ----------------------------------------- 예외를 수정해주지는 않는다.
 * 
 * 	=> 예외 처리 방법
 * 		---------------------------------- 중요함
 * 		=> 예외 복구 : try ~ catch
 * 					  ---	------ 에러 발생 시 처리 => 복구
 * 					   |=> 정상 수행
 * 		=> 예외 처리	: 예외를 처리하지 않고 => 예외 발생 시 시스템에 의해 처리한다.
 * 					  메서드 뒤에 첨부하며
 * 					  메서드()throws 예외 처리 (방식으로 구현)
 * 		----------------------------------
 * 		=> 임의 발생	: 테스트 용으로 주로 사용한다 => 프로그램이 정상적인지 확인할 때 사용
 * 					  throw => 에러를 발생시킨다 ==> 견고한지 확인한다.
 * 		=> 사용자 정의 예외 : 자바에서 지원하지 않는 예외 처리가 존재하는지 확인. => 필요시 직접 예외 처리를 만들어서 사용
 * 		=> 예외 처리의 상속도 ==> 처리하는 순서가 존재함
 * 
 * 						Object
 * 						  |
 * 				      Throwable : 에러 처리 최상위 클래스
 * 						  |
 * 				---------------------------------
 * 				|								|
 			  Error							Exception
 * 			=> 처리가 불가능				=> 처리가 가능하다 (소스 상) 
 * 			=> 종료 후에 다시 시작		=> 0으로 나누는 경우
 * 										=> UI 주소가 틀리다, IP가 틀리다, 파일이 틀리다
 * 
 * 							Exception
 * 								|
 * 			-------------------------------------
 * 			|									|
 * 	CheckedException						UnCheckedException
 * 	=> 컴파일 시에 예외 처리를 확인한다.		=> 컴파일 시에 예외를 확인하지 않는다.
 * 	=> 반드시 예외 처리를 한 후에 사용한다.	=> 필요 시에 예외 처리를 한다
 * 	=> java.io : 파일						=> 사용자 입력을 받는 경우
 * 											   ----------
 * 	=> java.sql : 오라클 연결					=> 실행 시 에러
 * 	=> java.lang : 쓰레드 관련				=> java
 * 	=> java.net : 네트워크
 * 	=> Open API : Jsoup
 * 	=> 웹(네트워크) = 반드시 예외 처리,
 * 	=> javac
 * 
 * 	=> 9장 라이브러리 => 자바에서 지원하는 클래스의 집합
 * 	-------------------------------------------------
 * 		=> java.lang, jvava.util, java.io
 * 		=> java.net, java.sql
 * 	-------------------------------------------------
 * 		=> javax.http.servlet. => 앱 관련 => JSP	
 * 											---- 3버전 => 4, 5 버전 출시
 * 
 * 		=> Front : 자바 스크립트 중심 (JavaScript => Jquery, Ajax, NodeJS, VueJs, ReactJS)
 *      	                          -----------                         ---------------
 *          	                      |TypeScript                          | NextJS
 *		=> Back : 프로그램 언어 (자바) => JSP, MVC, Spring, Spring-Boot
 *     		                             데이터베이스 (오라클, MySpl, Mariadb)
 *			| AI => 파이썬, 머신러닝, 딥러닝
 *					------ 데이터 분석 프로그램 짤때 쓰는 프로그램 ==> 넘파이 / 판다스 / MatplotLib (시각화) => seabon
 *		=> 과정 : Back-End										
 * 
 * 		CheckedExption
 * 		-------------- 반드시 예외 처리를 해서 사용한다 (컴파일 시에 예외 처리가 되어 있는지 확인)
 * 			   |
 * 		FileNoException
 * 		IOException
 * 		-------------------------- 파일 관련
 * 		SQLException
 * 		-------------------------- SQL(오라클 연동)
 * 		URLMalformedException
 * 		-------------------------- URL(network)
 * 		ClassNotFoundException
 * 			Class.forName() 	==> 클래스 명으로 메모리를 할당한다
 * 		-------------------------- 	리플랙션
 * 		InterruptedException
 * 			Thread.sleep() => 충돌 방지
 * 			=> 쓰레드는 프로그램 안에서 여러 개의 프로그램을 동시에 실행한다.
 * 		--------------------------	쓰레드 관련
 * 		
 * 		UncheckException : 필요 시에만 예외 처리를 한다 => 예외 처리를 생략할 수 있다
 * 				|			=> 지금까지 사용한 클래스
 * 		ArrayIndexOutBoundsException => 배열 범위 초기화
 * 		ClassCastExceotion	=> 클래스 형 변환
 * 		ArithmeticExceptopn	=> 산술 오류 => 0으로 나누는 경우
 * 		NullPointerExcepton => 메모리 할당이 없는 상태에서 객체 사용 시..
 * 							String, 윈도우 관련
 * 							------ 멤버 변수 선언 시 => 자동 초기화 => null, 크롤링 => 데이터가 없는 경우
 * 
 * 		----------------------------------------------------------
 *	 ex) 
 *            배열을 선언			배열을 선언  => ArryIndexOutOfBoundsException - 배열초과
 *            정수를 입력 받아서     정수를 입력받아서 => NumberFormatException - 정수가 아닌수 입력한다고 한다면, 발생할수 있는 예외
 *            나누기한다          	나누기한다 => ArithmeticException - 0으로 나누기
 *                  
 *            try {
 *                배열을 선언
 *                정수를 입력
 *                나누기
 *                ====> 평상시에 코딩 => 실행가능한 프로그램을 서술   
 *            } catch(ArryIndexOutOfBoundsException) {    => 다중조건
 *            } catch(NumberFormatException) {
 *            } catch(ArithmeticException) {
 *            }
 *            ... catch 는 여러개가 올 수 있다  
 *            ------------------------------------ 위 처럼 낱개 여러개를 쓸것이냐 -----------------------------------
 *            try {
 *                배열을 선언
 *                정수를 입력
 *                나누기
 *                ====> 평상시에 코딩 => 실행가능한 프로그램을 서술   
 *            } catch(RuntimeException) {    => 위 세가지 오류의 상위 버전이라 한개로 아래 세가지를 한번에 잡을수 있음 그래서 상속도를 외우는게 중요하다.
 *            }
 *				=> 위로 올라갈 수록 예외 처리 기능을 많이 가지고 있다
 *           	   --------------- 예외 처리 기능을 포함한다.
 *           
 *           1. 예외 처리의 형식
 *           	---------- 에러 발생 시에 건너뛰는 역할
 *           							 ------- 에러를 처리해주는 것은 아니다
 *           try {
 *           	정상 수행을 하는 소스
 *           	-------- 평상시 코딩 => 일부러 에러 발생하지 않는다.
 *           		1. 에러가 없는 경우 => try 에서 종료
 *           		2. 에러가 있는 경우 => 해당 에러를 등록한 catch 를 찾는다.
 *           } catch (예외 처리 클래스) {
 *           	에러 발생 시에 복구하는 위치
 *           } 
 *           	소스 코딩을 수행
 *           
 *           try {
 *           	문장 1
 *           	문장 2
 *           	문장 3	==> 에러 발생 ===> catch 로 이동 =====> 예외 처리를 하지 않는 경우에는 종료
 *           	문장 4
 *           	문장 5 ==> 오류가 없는 경우 => 1, 2, 3, 4, 5
 *           } catch (예외 처리) {
 *           	문장 6	==> 에러 발생시 처리하는 부분 (에러가 없는 경우에는 catch 를 수행하지 않는다.)
 *           }
 *           문장 7
 *           문장 8
 *           프로그램 종료
 *           
 *           => 1, 2, 6, 7, 8 => 종료 ==> 3에서 error 발생하면 4, 5, 6 건너 뜀.
 *           
 *            try : 정상 수행이 가능한 소스 코딩을 하는 부분 => 모든 프로그램을 소스가 서술
 *           	=> 1개만 설정
 *            catch : try 수행 중 에러가 발생하는 처리 => 복구
 *            	=> 여러 개 사용이 가능
 *           	==> Error 발생 시 1개의 catch 만 수행 ===> 다중 조건문과 비슷
 *           		------------------------------- 찾아서 처리하는 역할 => JVM
 *           	===> 소스 전체를 예외 처리
 *           	try {
 *           		모든 소스
 *           	} catch () {}
 *           
 *           	====> 예상 되는 부분만 예외 처리가 가능하다.
 *           	try {
 *           		문장 => 자주 에러가 발생하는 부분
 *           	} catch (Exception) {}
 *           
 *           
 *           
 *           
 *           
 */				

public class 예외처리_1 {

	public static void main(String[] args) {

	}

}
