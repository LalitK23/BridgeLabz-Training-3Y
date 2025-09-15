import java.util.*;
public class quotient_remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        float q = b / a;
        int r = a % b;
        System.out.print("The Quotient is "+q+" and Reminder is "+r+" of two number "+a+" and "+b);
    }
}
