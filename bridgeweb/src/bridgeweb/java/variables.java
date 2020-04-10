package bridgeweb.java;

public class variables {
	// 멤버 변수, 인스턴스 변수
	int num1;
	
	// 멤버 변수, 클래스 변수
	static int num2;
	
	// 매개변수
	public void printName(String name) {
        // 지역변수
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);		
	}
	
    public static void main(String[] args) {
        // 인스턴스 생성
        variables mc = new variables();
        // 인스턴스 변수 사용
        mc.num1 = 100;
        // 클래스 변수 사용
        variables.num2 = 50;  // num2 = 50 으로 사용해도 됨.

        // 인자로 매개변수에 값을 전달
        mc.printName("홍길동");
        
        System.out.printf("%d,%d",mc.num1, variables.num2);
    }	
	
}
