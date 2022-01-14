package List인터페이스계열의클래스예제;

import java.util.ArrayList;
import java.util.List;
//import java.lang.Integer;  //java.lang 패키지는 import 하지 않아도 자동적으로 포함된다.

public class ArraylistClassEx {

	public static void main(String[] args) {
		//가변배열 객체생성	<E>는 제네릭 기능 => Element(요소)
		//list<객체타입> 참조변수 = new 생성자<객체타입>(매개변수1, 매개변수2);  => 가변배열 생성하는 공식
		List<Integer> list = new ArrayList<Integer>();	//기본 10개의 공간을 확보함!!
		
		//객체 추가
//		list.add(new Integer(90));
		list.add(90);	//JDK1.5 버전부터 가능 => 자동박싱(boxing) /* 정수를 객체화 시킨 것이기 때문에 정수가 아니다.
		list.add(85);
		list.add(100);
		list.add(70);
		list.add(95);
		System.out.println(list);
		//[90, 85, 100, 70, 95]
		
		list.add(80);
		System.out.println(list);
		//[90, 85, 100, 70, 95, 80]
		
		list.add(1, 60);
		System.out.println(list);
		//[90, 60, 85, 100, 70, 95, 80]
		
		list.set(3, 65);
		System.out.println(list);
		//[90, 60, 85, 65, 70, 95, 80]
		
	}

}
