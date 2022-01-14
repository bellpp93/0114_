package Set인터페이스계열의클래스예제;

import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx {

	public static void main(String[] args) {
		//HashSet 객체 생성
		Set<Member> member_set = new HashSet<Member>();
		
		//[사례] 금융권 => 똑같은 객체가 두 개이면 안된다. '오직 하나'의 객체만 생성되어야 한다.
		Member member1 = new Member("손흥민", 31, "111111-1111111");
		Member member2 = new Member("손흥민", 31, "111111-1111111");
		
		member_set.add(member1);
		member_set.add(member2);
		
		System.out.println("객체의 총개수는? " + member_set.size());
		//객체의 총개수는? 1
		
		System.out.println(member1.hashCode());  //-1166721462
		System.out.println(member2.hashCode());  //-1166721462
		
		System.out.println(member1.equals(member2));  //true

	}

}
