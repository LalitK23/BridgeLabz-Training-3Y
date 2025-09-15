import java.util.*;
public class Int_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        int f = a + b * c;
        int s = a * b + c;
        int t = c + a / b;
        int fourth = a % b + c;
        System.out.print("The result of IntOperation are "+f+","+s+","+t+" and "+fourth);

    }
}
