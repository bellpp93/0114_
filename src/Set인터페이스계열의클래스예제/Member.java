package Set�������̽��迭��Ŭ��������;

//			�ڽ�Ŭ���� extends �θ�Ŭ����
public class Member {
	//�������(=�ν��Ͻ� ����)
	public String name;		//�̸�
	public int age;			//����
	public String juminNum;	//�ֹι�ȣ
	
	//������				�Ű�����(parameter) => ����������� �Ű������� �켱������ ó���Ѵ�.
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
		//�Ű������� ������ �ϱ����� this.�� �ش�.
	}
	//�θ�Ŭ������ �޼ҵ带 �������� �������̵� ��Ű�� ���
	//	=> ���� e�� �Է��ϰ� Ctrl + Spacebar ���ÿ� ������ �޼ҵ尡 ���. ���� Ŭ���Ѵ�.
	@Override  //������̼� => ���� ���� => ������ ���� ����
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age)
					&& member.juminNum.equals(juminNum);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode();
	}
}
