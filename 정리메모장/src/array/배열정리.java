package array;
/*
 * 배열 : 같은 데이터 형의 데이터를 여러 개 모아서 정리한 것.
 * 			  ---------
 * 		특징 -	연속적으로 같은 크기의 메모리를 만들며, 한 번 실행하면 값을 변경할 수가 없다.
 * 				인덱스는 무조건 순차적으로 0번부터 시작된다.
 * 				실제 값을 가지고 있는 것이 아닌, 데이터가 저장되어 있는 위치 주소를 참조하여 여러 개의 데이터를 관리한다
 * 				일반 변수 취급을 한다.								------------------- (참조형 개념)
 * 				배열도 객체이기 때문에 Heap에 데이터를 저장한다.
 * 				
 * 				
 * 		장점 -	한 개의 이름으로 여러 개의 변수를 제어할 수 있다.
 * 								 ------------------- (구분 하기 위해 인덱스를 사용한다.)
 * 				반복문 처리가 편리하다.
 * 				
 * 
 * 		단점 -	웹에서 검색 결과를 전송하려고 할 때 처럼 값이 얼마나 들어올지 알 수 없는 경우에는 배열로 고정하기가 어렵다.
 * 				같은 데이터 형만 모아서 관리할 수 있다.
 * 				생성이 되면 삭제, 추가가 불가능하여 고정적이라는 단점이 있다.
 * 								 ------------ (배열의 크기를 늘리려면 큰 배열을 새로 생성해야 한다.)
 * 				
 * 										
 * 		선언하는 방식
 * 			=>	데이터 형[] 배열 명;		
 * 
 * 		초기화 방식
 * 			=> 데이터 형[] 배열 명 = {값1, 2, ...}; => 선언과 동시에 값을 부여하고 부여한 값 만큼 배열의 크기 지정.
 * 
 * 			=> 데이터 형[] 배열 명 = new 데이터 형[개수]	=> 이 방식은 자동 초기화가 된다.
 * 				예시 => int[] arr = new int[7];	=> 배열의 크기가 7인 정수형 배열 arr 선언. 값은 default 값으로 초기화.
 * =================================================================================================================================
 *  	
 * 			******* tip *******
 * 		new 키워드를 이용하여 배열 객체를 동적으로 할당한다.
 * 		실제로 배열 생성 시 배열 객체가 메모리에 생성되고, 배열 변수는 해당 배열의 객체를 참조하게 된다.	
 * 		(배열 명 == 배열 객체를 가리키는 참조 변수)
 * 
 * 		배열도 객체이기 때문에 Heap 에 데이터를 저장한다.
 *   
 */
public class 배열정리 {

}
