package List�������̽��迭��Ŭ��������;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		//�����迭 ��ü����
		String[] name = {"������","����ȣ","������","��ȫ��","�ڰ渮"};
		
		//�����迭 ��ü����	<E>�� ���׸� ��� => Element(���)
		//list<��üŸ��> �������� = new ������<��üŸ��>(�Ű�����1, �Ű�����2);  => �����迭 �����ϴ� ����
		//List<String> list = new Vector<String>();  => �⺻ 10���� ���� Ȯ��
		List<String> list = new Vector<String>(4,3);  //java.util���� ���� /<String>�� '���ڿ� ��ü�� ��ڴ�' ��� ��.
		//Vector(int initialCapacity, int capacityIncrement) ���� (4,3)�� => �ʱ� ������ �뷮���� 4���̸�, �߰��� �þ�°� 3�������� �ϰڴ� ��� ��.
		
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());  //�뷮�� ����ϴ� ��
		//������ �뷮��: 4
		
		//���� �迭�� String ��ü���� Vector �����迭�� �����ϱ�
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list);
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮]  => ��ü�� ��ü ���̴�',����'���� ���еȴ�.
		
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());  //�޼ҵ� ȣ��
		//������ �뷮��: 7 => �ʱⰪ 4���� '�����迭'�� �ִ� ��(5��)�� �����ϴ��� 3���� �þ
		
		System.out.println("���Ϳ� ����� ����� ������ " + list.size());  //��ü�� ���� ������(����� ����ϴ� ��)
		//���Ϳ� ����� ����� ������ 5
		
		
//		��ü '�߰�'�ϴ� ���(�����迭)
		list.add("�ڱ���");  //list.add���� ���ڰ��� 1���ָ� '������ �� ��'�� ��ġ��Ų��.
		System.out.println(list);
		//[������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]
		
		//�����迭 �߰��� ��ü �����ֱ�(����)
		//������� ����ȣ ���̿� "������"�� �����ϰ��� �Ѵ�.
		list.add(1, "������");  //list.add���� ���ڰ� 2���� (index��, String��) => ���� ���ϴ� ��ġ�� ��ġ ��ų �� �ִ�.
		System.out.println(list);
		//[������, ������, ����ȣ, ������, ��ȫ��, �ڰ渮, �ڱ���]
		//���� 2�� �������� '�����ε�'�̶�� �ϸ� '������'�� �����ϴ� ����̴�.
		
		
//		��ü '�˻�'�ϴ� ���(�����迭)
		System.out.println(list.get(2));  //����ȣ ���
		
		boolean contains_result = list.contains("��ȫ��");
		System.out.println(contains_result);  //true ���
		
		boolean contains_result2 = list.contains("ȫ�浿");
		System.out.println(contains_result2);  //false ���
		
		for(String item : list) {  //���� for��(�ַ� ��ü�� �ݺ��ؼ� ����Ҷ� ���)
			System.out.print(item + "\t");  //"\t"�� tab��ŭ ����� ����ض� ��� �� => �̽�����������
		}
		//������	������	����ȣ	������	��ȫ��	�ڰ渮	�ڱ���
		
		
//		��ü '����'�ϴ� ���(�����迭)
		System.out.println();  //�ٹٲ� => ��¿��� �� �� ���Ͱ� �ʿ��Ҷ� ���
		/* ��ü �����ϱ� => ����ȣ ��ü�� �̹��� ��ü�� �����ϱ� */
		list.set(2, "�̹���");
		System.out.println(list);
		//[������, ������, �̹���, ������, ��ȫ��, �ڰ渮, �ڱ���]
		
		
//		��ü '����'�ϴ� ���(�����迭)
		System.out.println();  //�ٹٲ�
		/* ��ü �����ϱ� => ������ ��ü �����ϱ� */
		list.remove(3);
		System.out.println(list);
		//[������, ������, �̹���, ��ȫ��, �ڰ渮, �ڱ���]
		
		/* ��ü �����ϱ� => ������ ��ü �����ϱ�*/
		System.out.println();  //�ٹٲ�
		list.remove("������");
		System.out.println(list);
		
		
//		��ü '����'�ϴ� ���
		System.out.println();  //�ٹٲ�
		/* �����迭�� ��ü �����ϱ� => ��������(Ascending Sort ���ڷ� asc) */
		System.out.println("[��ü �������� �����ϱ�]");
		Collections.sort(list);
		System.out.println(list);
		//[������, ��ȫ��, �ڰ渮, �ڱ���, �̹���]
		
		System.out.println();  //�ٹٲ�
		/* �����迭�� ��ü �����ϱ� => ��������(Descending Sort ���ڷ� desc) */
		System.out.println("[��ü �������� �����ϱ�]");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		//[�̹���, �ڱ���, �ڰ渮, ��ȫ��, ������]
		
		System.out.println();  //�ٹٲ�
		list.add("��ȫ��");  //Vector ��ü�� '�ߺ�����' ����
		System.out.println(list);
		//[�̹���, �ڱ���, �ڰ渮, ��ȫ��, ������, ��ȫ��]
		
	}

}
