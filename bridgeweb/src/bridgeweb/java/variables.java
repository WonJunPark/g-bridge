package bridgeweb.java;

public class variables {
	// ��� ����, �ν��Ͻ� ����
	int num1;
	
	// ��� ����, Ŭ���� ����
	static int num2;
	
	// �Ű�����
	public void printName(String name) {
        // ��������
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);		
	}
	
    public static void main(String[] args) {
        // �ν��Ͻ� ����
        variables mc = new variables();
        // �ν��Ͻ� ���� ���
        mc.num1 = 100;
        // Ŭ���� ���� ���
        variables.num2 = 50;  // num2 = 50 ���� ����ص� ��.

        // ���ڷ� �Ű������� ���� ����
        mc.printName("ȫ�浿");
        
        System.out.printf("%d,%d",mc.num1, variables.num2);
    }	
	
}
