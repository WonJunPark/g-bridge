package bridgeweb.java;

public class Operator1 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 14;

        int result1 = num1 * num2;
        int result2 = num1 % num2;

        System.out.printf("result1 : %d \n", result1);
        System.out.printf("result2 : %d \n", result2);
        System.out.println("-------------------");

        num1++;
        num2 *= 2;
        System.out.printf("num1++ : %d \n", num1);
        System.out.printf("num2 *= 2 : %d \n", num2);
        System.out.println("-------------------");

        System.out.printf("num1++ : %d \n", num1++);
        System.out.printf("--num1 : %d \n", --num1);
    }
}
