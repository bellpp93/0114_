package List인터페이스계열의클래스예제;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClassEx {

	public static void main(String[] args) {
		//가변배열 객체생성	<E>는 제네릭 기능 => Element(요소)
		//list<객체타입> 참조변수 = new 생성자<객체타입>(매개변수1, 매개변수2);  => 가변배열 생성하는 공식
		List<Integer> list = new ArrayList<Integer>();  //기본 10개의 공간을 확보함!!
	}

}
