package Map�������̽��迭��Ŭ��������;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		//��ü ����
		Properties prop = new Properties();
		
		//prop�� ����Ű�� ��ü�� key, value �� �ֱ�
		prop.setProperty("name", "ȫ�浿");  //�����Ҷ��� set
		prop.setProperty("email", "hong77@naver.com");
		prop.setProperty("HP", "010-2315-1234");
		
		//System.out.println(prop);  //������ �߿������ʰ� Ű�� ���� �� ������ ����Ǿ� �ִ°��� �߿��ϴ�.
		//{email=hong77@naver.com, name=ȫ�浿, HP=010-2315-1234}
		
		//��������
		Enumeration enu = prop.propertyNames();  //������(������ ���Ѽ� ��ü�� �������� �ϴ� ��)
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();  //�̸����� ������´�.
			System.out.println(ele + ":" + prop.getProperty(ele));  //������ö��� get
		}
	}
}
