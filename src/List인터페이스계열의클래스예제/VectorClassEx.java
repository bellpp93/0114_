package List�������̽��迭��Ŭ��������;

import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		//�����迭 ��ü����
		String[] name = {"������","����ȣ","������","��ȫ��","�ڰ渮"};
		
		//�����迭 ��ü����					<E>�� ���׸� ��� => Element(���)
		List<String> list = new Vector<String>(4,3);  //java.util���� ���� /<String>�� '���ڿ� ��ü�� ��ڴ�' ��� ��.
		//Vector(int initialCapacity, int capacityIncrement) ���� (4,3)�� => �ʱ� ������ �뷮���� 4�����ϰ� �߰��� �þ�°� 3�������� �ϰڴ� ��� ��.
		
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());  //�뷮�� ����ϴ� ��
		//������ �뷮��: 4
		
		//���� �迭�� String ��ü���� Vector �����迭�� �����ϱ�
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list);
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮]
		
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());  //�޼ҵ� ȣ��
		//������ �뷮��: 7 => �ʱⰪ 4���� '�����迭'�� �ִ� ��(5��)�� �����ϴ��� 3���� �þ
		System.out.println("���Ϳ� ����� ����� ������ " + list.size());  //��ü�� ���� ������(����� ����ϴ� ��)
		//���Ϳ� ����� ����� ������ 5
		
//		��ü '�߰�'�ϴ� ���(�����迭)
		list.add("�ڱ���");  //add���� 1���ָ� ������ �� �ڿ� ��ġ�Ѵ�.
		System.out.println(list);
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]
		
		//�����迭 �߰��� ��ü �����ֱ�(����)
		//������� ����ȣ ���̿� "������"�� �����ϰ��� �Ѵ�.
		list.add(1, "������");  //(index��, String��) => ���� ���ϴ� ��ġ�� ��ġ ��ų �� �ִ�.
		System.out.println(list);
		//[������, ������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]
		
//		��ü '�˻�'�ϴ� ���(�����迭)
		System.out.println(list.get(2));  //����ȣ ���
		
		boolean contains_result = list.contains("��ȫ��");
		System.out.println(contains_result);  //true ���
		
		for(String item : list) {  //���� for��(�ַ� ��ü�� �ݺ��ؼ� ����Ҷ� ���)
			System.out.print(item + "\t");  //tab��ŭ ����� ����ض�
		}
		//������	������	����ȣ	������	��ȫ��	�ڰ渮	�ڱ���
	}

}
