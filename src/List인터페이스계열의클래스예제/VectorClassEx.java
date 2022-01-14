package List인터페이스계열의클래스예제;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		//고정배열 객체생성
		String[] name = {"김진명","최인호","조정래","김홍신","박경리"};
		
		//가변배열 객체생성	<E>는 제네릭 기능 => Element(요소)
		//list<객체타입> 참조변수 = new 생성자<객체타입>(매개변수1, 매개변수2);  => 가변배열 생성하는 공식
		//List<String> list = new Vector<String>();  => 기본 10개의 공간 확보
		List<String> list = new Vector<String>(4,3);  //java.util에서 참조 /<String>은 '문자열 객체만 담겠다' 라는 뜻.
		//Vector(int initialCapacity, int capacityIncrement) 위에 (4,3)은 => 초기 백터의 용량값은 4개이며, 추가로 늘어나는건 3개씩으로 하겠다 라는 뜻.
		
		System.out.println("백터의 용량은: " + ((Vector<String>) list).capacity());  //용량을 출력하는 값
		//백터의 용량은: 4
		
		//고정 배열의 String 객체들을 Vector 가변배열에 저장하기
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list);
		//[김진명, 최인호, 조정래, 김홍신, 박경리]  => 객체와 객체 사이는',공백'으로 구분된다.
		
		System.out.println("백터의 용량은: " + ((Vector<String>) list).capacity());  //메소드 호출
		//백터의 용량은: 7 => 초기값 4에서 '고정배열'에 있는 값(5개)을 추출하느라 3개가 늘어남
		
		System.out.println("백터에 저장된 요소의 개수는 " + list.size());  //객체의 개수 얻어오기(사이즈를 출력하는 값)
		//백터에 저장된 요소의 개수는 5
		
		
//		객체 '추가'하는 방법(가변배열)
		list.add("박근혜");  //list.add에서 인자값을 1개주면 '무조건 맨 뒤'에 위치시킨다.
		System.out.println(list);
		//[김진명, 최인호, 조정래, 김홍신, 박경리, 박근혜]
		
		//가변배열 중간에 객체 끼워넣기(삽입)
		//김진명과 최인호 사이에 "공지영"을 삽입하고자 한다.
		list.add(1, "공지영");  //list.add에서 인자값 2개는 (index값, String값) => 내가 원하는 위치에 위치 시킬 수 있다.
		System.out.println(list);
		//[김진명, 공지영, 최인호, 조정래, 김홍신, 박경리, 박근혜]
		//위에 2개 같은것을 '오버로딩'이라고 하며 '다형성'을 구현하는 방법이다.
		
		
//		객체 '검색'하는 방법(가변배열)
		System.out.println(list.get(2));  //최인호 출력
		
		boolean contains_result = list.contains("김홍신");
		System.out.println(contains_result);  //true 출력
		
		boolean contains_result2 = list.contains("홍길동");
		System.out.println(contains_result2);  //false 출력
		
		for(String item : list) {  //향상된 for문(주로 객체를 반복해서 출력할때 사용)
			System.out.print(item + "\t");  //"\t"는 tab만큼 띄워서 출력해라 라는 뜻 => 이스케이프문자
		}
		//김진명	공지영	최인호	조정래	김홍신	박경리	박근혜
		
		
//		객체 '수정'하는 방법(가변배열)
		System.out.println();  //줄바꿈 => 출력에서 한 줄 엔터가 필요할때 사용
		/* 객체 수정하기 => 최인호 객체를 이문열 객체로 수정하기 */
		list.set(2, "이문열");
		System.out.println(list);
		//[김진명, 공지영, 이문열, 조정래, 김홍신, 박경리, 박근혜]
		
		
//		객체 '삭제'하는 방법(가변배열)
		System.out.println();  //줄바꿈
		/* 객체 삭제하기 => 조정래 객체 삭제하기 */
		list.remove(3);
		System.out.println(list);
		//[김진명, 공지영, 이문열, 김홍신, 박경리, 박근혜]
		
		/* 객체 삭제하기 => 공지영 객체 삭제하기*/
		System.out.println();  //줄바꿈
		list.remove("공지영");
		System.out.println(list);
		
		
//		객체 '정렬'하는 방법
		System.out.println();  //줄바꿈
		/* 가변배열의 객체 정렬하기 => 오름차순(Ascending Sort 양자로 asc) */
		System.out.println("[객체 오름차순 정렬하기]");
		Collections.sort(list);
		System.out.println(list);
		//[김진명, 김홍신, 박경리, 박근혜, 이문열]
		
		System.out.println();  //줄바꿈
		/* 가변배열의 객체 정렬하기 => 내림차순(Descending Sort 양자로 desc) */
		System.out.println("[객체 내림차순 정렬하기]");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		//[이문열, 박근혜, 박경리, 김홍신, 김진명]
		
		System.out.println();  //줄바꿈
		list.add("김홍신");  //Vector 객체는 '중복저장' 가능
		System.out.println(list);
		//[이문열, 박근혜, 박경리, 김홍신, 김진명, 김홍신]
		
	}

}
