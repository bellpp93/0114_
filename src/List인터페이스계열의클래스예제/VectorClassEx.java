package List인터페이스계열의클래스예제;

import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		//고정배열 객체생성
		String[] name = {"김진명","최인호","조정래","김홍신","박경리"};
		
		//가변배열 객체생성					<E>는 제네릭 기능 => Element(요소)
		List<String> list = new Vector<String>(4,3);  //java.util에서 참조 /<String>은 '문자열 객체만 담겠다' 라는 뜻.
		//Vector(int initialCapacity, int capacityIncrement) 위에 (4,3)은 => 초기 백터의 용량값은 4개로하고 추가로 늘어나는건 3개씩으로 하겠다 라는 뜻.
		
		System.out.println("백터의 용량은: " + ((Vector<String>) list).capacity());  //용량을 출력하는 값
		//백터의 용량은: 4
		
		//고정 배열의 String 객체들을 Vector 가변배열에 저장하기
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list);
		//[김진명, 최인호, 조정래, 김홍신, 박경리]
		
		System.out.println("백터의 용량은: " + ((Vector<String>) list).capacity());  //메소드 호출
		//백터의 용량은: 7 => 초기값 4에서 '고정배열'에 있는 값(5개)을 추출하느라 3개가 늘어남
		System.out.println("백터에 저장된 요소의 개수는 " + list.size());  //객체의 개수 얻어오기(사이즈를 출력하는 값)
		//백터에 저장된 요소의 개수는 5
		
//		객체 '추가'하는 방법(가변배열)
		list.add("박근혜");  //add값을 1개주면 무조건 맨 뒤에 위치한다.
		System.out.println(list);
		//[김진명, 최인호, 조정래, 김홍신, 박경리, 박근혜]
		
		//가변배열 중간에 객체 끼워넣기(삽입)
		//김진명과 최인호 사이에 "공지영"을 삽입하고자 한다.
		list.add(1, "공지영");  //(index값, String값) => 내가 원하는 위치에 위치 시킬 수 있다.
		System.out.println(list);
		//[김진명, 공지영, 최인호, 조정래, 김홍신, 박경리, 박근혜]
		
//		객체 '검색'하는 방법(가변배열)
		System.out.println(list.get(2));  //최인호 출력
		
		boolean contains_result = list.contains("김홍신");
		System.out.println(contains_result);  //true 출력
		
		for(String item : list) {  //향상된 for문(주로 객체를 반복해서 출력할때 사용)
			System.out.print(item + "\t");  //tab만큼 띄워서 출력해라
		}
		//김진명	공지영	최인호	조정래	김홍신	박경리	박근혜
	}

}
