/*
 * 	객체 지향 프로그램 => 자바 (CBD)	=> 데이터 관리
 * 										---------
 * 	----------------		=> 이미 필요한 기능은 존재 => 조립해서 만드는 프로그램 (레고)
 * 	1. 클래스
 * 		= 변수 설정 (어떤 데이터가 필요한지) : 캡슐화 (데이터 보호) => getter / setter 
 * 		  --------
 * 			기본형 데이터 형 =>
 * 			배열
 * 			클래스 => 포함 클래스 : String => 데이터형
 * 
 * 		1) 요구 사항
 * 			=> 데이터 선언
 * 			=> 데이터 선언 => 데이터 수집 => 데이터 분석 => 데이터를 분리 => 데이터 예측
 * 			   --------------------------------------------------------------------- 머신 러닝 / 딥 러닝
 * 																					 ------------------
 * 																					 | 예측 => 프로그램 제작 (AI)
 * 		2) 기능 설정 : 목록 / 상세 / 예약 / 결제 ...메서드
 * 		   ----------------------------------------------
 * 			변수 + 메서드 => 한 개의 기능 => 설계 (클래스) => 활용 => 객체
 * 					| 기능이 변경 => 사용자가 요구 (오버라이딩)
 * 			----------- 객체에 의해 관리
 * 
 * 		= 변수에 초기 값 : 생성자 => 서버 / 데이터베이스 (미리 연결)
 * 		= 변수를 활용 : 메서드 => 기능 (수정, 추가) => 다형성 (오버로딩 / 오버라이딩) => 웹 (메뉴)
 * 
 * 	2. 접근 지정어 => public / private / protected / default (접근 범위 지정)
 * 
 * 	3. 상속 / 포함 => 재사용 기법
 * 						있는 그대로 사용 : 포함 => Spring => POJO
 * 						변경해서 사용 : 상속 => 윈도우, 네트워크, 쓰레드
 * 	------------------------------- *** 객체 지향의 3대 특성 (캡슐화, 상속, 다형성) ***
 * 
 * 	4. 클래스 종류 
 * 		= 일반 클래스		***
 * 		= 추상 클래스
 * 		= 인터페이스			***
 * 		= 내부 클래스
 * 			= 멤버 클래스	***
 * 			= 익명의 클래스	***
 * 			= 지역 클래스 
 * 		= 종단 클래스
 * 
 * 	5. 조립법
 * 		= 패키지 => 관련 클래스끼리 모아서 관리 : import
 * 		  ----- 폴더 java, javax
 * 
 * 	6. 예외 처리 : 프로그램의 비정상 종료 방지, 사전에 에러를 방지하는 역할.
 * 											  --------------------------
 * 												파일 	: 경로 명, 파일 명
 * 
 * 												네트워크	: URL / Server IP
 * 														 ---- Jsoup
 * 	---------------- 기본 문법 (8장) => 프로그램 개발 
 * 	7. 라이브러리 (자바), 외부에서 지원 (Jsoup, lombok)
 * 						 ----------------------------
 * 						 mvnrepository.com
 * 	J2Se
 * 	-------------------------------------------------
 * 	J2EE : 웹 개발 => JSP / Srvlet (기업용 환경)
 * 	------------------------------------------ maven, Spring-boot
 * 
 * 	=> 기본 이론, 구현 => 웹 (구현)
 * 	   -------- 면접
 * 	1) 클래스의 구조 (설계)
 * 		class ClassName {
 * 			---------------------------
 * 				데이터 선언
 * 					=> 멤버 변수
 * 						= 인스턴스 변수 : new 를 사용할 때 마다 메모리가 따로 생성된다 => 여러 개 저장이 가능함
 * 						= 정적 변수 : static => 메모리 공간을 1개만 사용
 * 						= 변수 : 메모리에 저장 / 메모리에 읽기
 * 								 ----------- /  ----------- 메서드화
 * 								  setter		   getter
 * 						** static 을 제외한 모든 변수는 은닉화 (데이터 보호) => 캡슐화
 * 																			 ------ 필요 시에는 사용이 가능하다.
 * 							=> 시큐어 코딩
 * 						= 다른 클래스와 연결해서 사용이 가능하게 만든다
 * 						= 객체 == 객체 => 상호 연결해서 사용한다.
 * 						  -----------
 * 			Back-End	(자바, JSP, Spring, Oracle, ...)
 * 			Front-End	(JavaScript) => Ajax, Next.js, Vue.js, React
 * 			---------------------------
 * 			데이터 초기화 => 클래스 영역 안에서는 선언만 가능하다(선언부) => 구현부는 (파일 읽기, 화면 UI, 웹 연결, 연산 처리, 제어문) 활용이 가능하다.
 * 
 * 				생성자	=> 모든 클래스에서 반드시 한 개 이상이 포함되어 있어야 한다
 * 						==> 생략이 된 경우에는 컴파일러가 자동으로 default 생성자 하나를 생성하여 실행한다.
 * 						===> 매개 변수가 없는 생성자이다.
 * 						class A {
 * 							A(){}				===> default 생성자 => 없는 경우에 자동으로 생성.
 * 							A(int a){}
 * 							A(int a, int b){}
 * 						}
 * 					= 리턴 형이 없다.
 * 					= 클래스 명과 동일하다.
 * 					= 여러 개 사용할 수 있다 => 오버로딩
 * 					= 객체 생성 시 반드시 호출해야 한다.
 * 					= 시작과 동시에 처리해야하는 기능이 있는 경우 => 화면 UI가 해당.
 * 
 * 				초기화 블럭 => 인스턴스 변수 => 자동으로 처리(호출을 하지 않음)
 * 				{
 * 					구현이 가능
 * 					=> 자동 로그인, Cookie, Session 에 등록, 데이터 베이스 연동
 * 				}
 * 				정적 블럭
 * 				static {
 * 					static 변수의 초기화
 * 				}
 * 			---------------------------
 * 				메서드 : 요청 처리 => 응답 => 웹 (메뉴) => 버튼, 마우스 클릭
 * 			---------------------------
 * 		}
 * 			======== 설계 => 메모리에 저장.
 * 		
 * 	2) 객체 생성
 * 		클래스 명 변수 명(객체) => new 클래스 명()
 * 								  |   --------- 생성자이다 ===> new 가 저장 공간을 만들어주면 => 초기화를 대입하는 역할이다.
 * 								 ---- 클래스 크기 만큼 메모리를 확보해준다 => 저장할 공간을 만들어준다.
 * 			 	 ------------ 변수, 메서드 => 동시에 관리 => 객체
 * 	3) 객체 활용
 * 		객체명.변수명, 객체명.메서드명()
 * 
 * 	4) 객체 소멸 => disconnection
 * 		객체 명 = null => 연결 되는 주소를 지워준다 (사용 X => 가비지 컬렉션 대상)
 * 															----------------- 주소가 null 인 경우, 사용하지 않는 경우
 * 															----------------- 메모리를 자동으로 회수.
 * 	=> 공장 => 컴퓨터(임대)
 * 					|
 * 		책상 위에 올려 코드를 연결 => new (바로 사용이 가능하게 세팅하는 개념)
 * 					|
 * 				파워 연결 => 작동하게 만든다 => 생성자 => 바로 사용이 가능하게 만든다.
 * 				
 * 				데이터를 저장할 메모리를 만들고 초기 값이 설정된다 => 바로 사용 가능하게 만든다.
 * 				--------------------------------------------------------------------------
 * 				자바 번역)
 * 						new 클래스명()
 * 			여러 개의 데이터 / 여러 개의 메서드가 존재
 * 			--------------------------------------- . << 메모리에 접근하는 기능을 하는 연산자.
 * 
 * 	=> 자바 프로그램의 순서
 * 		관련된 클래스를 모아준다. : 패키지
 * 		-------------------------------- client / server => user / admin
 * 		=> 입출력 관련 => java.io / 윈도우 관련 => javax.swing, / java.util =>>> ??
 * 		package 경로명;	==> 한 번만 사용이 가능하다.
 * 
 * 		필요한 클래스를 가지고 온다 : 사용자 정의, 라이브러리
 * 		import ..... 	==>> 여러 개 사용이 가능하다.
 * 
 * 		class ClassName {
 * 		
 * 		}
 * 		패키지가 만들어진 경우
 * 		--------------------
 * 		연결 (조립) => 접근의 문제
 * 		------------------------------------------------------------- 접근 지정어
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 							자신의 클래스		같은 패키지			같은 패키지 + 상속(다른 패키지)			모든 클래스
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 			**private			 O																				=> 본인만 아는 상태
 * 							 멤버 변수
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 			**default			 O					O
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 			protected			 O					O							O
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 			**public			 O					O							O								O	(오픈) => 공개
 * 							클래스 / 메서드 / 생성자	=> 다른 클래스와 연결이 되어야 하기 때문에
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 
 * 			** 클래스	: public 으로 선언 (특별한 경우가 아닌 경우)
 * 			** 메서드	: public	=> 다른 클래스와 통신을 해야 하기 때문에
 * 			** 변수		: private	=> 다른 클래스에 사용이 되지 않게 해야 함 => 은닉화 ==> 경우에 따라 사용하게 만드는 경우도 있고 getter, setter 를이용하여 메서드로 만든다.
 * 			** 생성자	: public	=> 다른 클래스에서 메모리가 할당이 되어여 하기 때문에
 * 		--------------------------------------------------------------------------------------------------------------------------
 * 			접근 범위의 크기
 * 			private < default < protected < public
 * 		
 * 		1. 자바 프로그램은 모아서 관리한다.
 * 		---------------------------------
 * 			1) 변수
 * 			2) 연산자
 * 			3) 제어문
 * 			--------- 문법 사항
 * 
 * 			묶음 => 한 개의 이름으로 제어한다.
 * 			1) 변수 => 여러 개가 있으면 제어하기가 어려움	
 * 					==> 한 개의 이름으로 제어할 수 있게 만들어줌
 * 					===> 배열 (이름은 한 개, 인덱스를 이용하여 접근.
 * 						 단점) 고정적이다, 연속적으로 메모리를 설정하기 때문에 => 같은 크기(데이터 형)만 모아서 관리한다.
 * 					====> 이를 보완한 것이 => 클래스 (.)을 이용하여 클래스를 사용 => 다른 데이터 형을 모아서 관리하기 때문에 (제한이 없다)
 * 				
 * 			2) 명령문 => 연산자 / 제어문
 * 						 단점) 중복이 있고, 다시 처음으로 돌아갈 수 없다.
 * 						----------------------------------------------
 * 						묶어서 사용 ==> 메서드
 * 			---------------------------------------------------------- 클래스 (변수와 메서드를 묶은 것)
 * 			클래스 
 * 				=> 변수만 묶어서 사용하는 경우 : 사용자 정의 데이터 형
 * 				=> 관련된 메서드만 묶어서 사용하는것 : 액션 클래스
 * 				=> 변수 + 메서드 : 혼합
 * 			기능 별로 다시 묶어서 사용
 * 			--------
 * 			게시판 / 회원 가입 / 맛집 / 여행 / .... ===> 패키지 (가장 큰 단위. <== 관련된 기능을 묶은) ===> 다른 패키지면 같은 이름의 클래스 명을 사용할 수 있다.
 * 													   ------
 * 														 | 교보 서적
 * 														 | 헌 책방
 * 			board(라는 폴더가 있다면)
 * 				=> BoardList
 * 				=> BoardInsert
 * 				=> BoardDetail
 * 			
 * 			=> 폴더 별로 구분하여 => 검색을 쉽게 해주는 기능
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class 접근지정어_1 {

	public static void main(String[] args) {
		

	}

}
