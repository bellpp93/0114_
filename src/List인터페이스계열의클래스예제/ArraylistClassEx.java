package List�������̽��迭��Ŭ��������;

import java.util.ArrayList;
import java.util.List;
//import java.lang.Integer;  //java.lang ��Ű���� import ���� �ʾƵ� �ڵ������� ���Եȴ�.

public class ArraylistClassEx {

	public static void main(String[] args) {
		//�����迭 ��ü����	<E>�� ���׸� ��� => Element(���)
		//list<��üŸ��> �������� = new ������<��üŸ��>(�Ű�����1, �Ű�����2);  => �����迭 �����ϴ� ����
		List<Integer> list = new ArrayList<Integer>();	//�⺻ 10���� ������ Ȯ����!!
		
		//��ü �߰�
//		list.add(new Integer(90));
		list.add(90);	//JDK1.5 �������� ���� => �ڵ��ڽ�(boxing) /* ������ ��üȭ ��Ų ���̱� ������ ������ �ƴϴ�.
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
