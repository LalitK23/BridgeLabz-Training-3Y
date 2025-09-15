import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("enetr the second number : ");
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = a / b;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+add+" , "+sub+" , "+mul+" , "+" and "+div);
    }
}
