package bridgeweb.java;
import java.util.Scanner;

public class Conditional {
    void login() {
        Scanner scan = new Scanner(System.in);

        System.out.print("## ���̵� �Է��ϼ���: ");		
        String uname = scan.next();

        System.out.print("# ��й�ȣ�� �Է��ϼ���: ");
        String pwd = scan.next();

        if(uname.equals("hong") && pwd.equals("1234")) {
        System.out.println("���� Ȯ��!! -> �α��� ����");
        }
        else {
        System.out.println("���̵� ��й�ȣ�� Ʋ�Ƚ��ϴ�.!!");
        }
    }

	void check() {
	    int cnt = 10;
	    String msg = cnt > 0? "���ο� ������ �ֽ��ϴ�.!!" : "���ο� ������ �����ϴ�.!!";
	    System.out.println(msg);
	}
	
	public static void main(String[] args) {
	    Conditional con = new Conditional();
	
	    while(true) {
	        System.out.printf("# �޴��� �����ϼ��� (1:�α���, 2:����Ȯ��, x:����) ==> ");
	        Scanner scan = new Scanner(System.in);
	        String sel = scan.next();
	
	        switch(sel) {
	        case "1": con.login();break;
	        case "2": con.check();break;
	        case "x": System.exit(0);
	        default : System.out.println("�߸��� �Է� �Դϴ�.!!");
	        }	
	    }
	}
}
