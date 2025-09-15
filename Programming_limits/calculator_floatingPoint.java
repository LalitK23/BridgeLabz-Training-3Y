import java.util.Scanner;

public class calculator_floatingPoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.print("enetr the second number : ");
        float b = sc.nextFloat();
        float add = a + b;
        float sub = a - b;
        float mul = a * b;
        float div = a / b;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+add+" , "+sub+" , "+mul+" , "+" and "+div);
    }
}
