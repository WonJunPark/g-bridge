package bridgeweb.java;

public class Loop {
    public static void main(String[] args) {
        int power = 13;
        String members[] = {"ȫ�浿","��浿","����","�ƹ���"};

        // 0 ~ 9 ���� �� 10ȸ �ݺ�
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }

        // �迭 ������ ũ�⸸ŭ �ݺ��ϸ鼭 String Ÿ�� �����͸� ������ ��.
        for(String name : members) {
            System.out.println(name);
        }

        // power > 10 ���� ū ��쿡�� go() �Լ��� ȣ���� ���۽�Ű�� power�� 1����
        while(power > 10) {
            System.out.println("go");
            power--;
        }
        System.out.println("stop");
    }
}