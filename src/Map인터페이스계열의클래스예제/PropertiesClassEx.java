package Map인터페이스계열의클래스예제;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		//객체 생성
		Properties prop = new Properties();
		
		//prop가 가리키는 객체에 key, value 값 넣기
		prop.setProperty("name", "홍길동");  //저장할때는 set
		prop.setProperty("email", "hong77@naver.com");
		prop.setProperty("HP", "010-2315-1234");
		
		//System.out.println(prop);  //순서는 중요하지않고 키와 값이 한 쌍으로 저장되어 있는것이 중요하다.
		//{email=hong77@naver.com, name=홍길동, HP=010-2315-1234}
		
		//가져오기
		Enumeration enu = prop.propertyNames();  //열거형(순서를 지켜서 객체를 가져오게 하는 것)
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();  //이름부터 가지고온다.
			System.out.println(ele + ":" + prop.getProperty(ele));  //가지고올때는 get
		}
	}
}
