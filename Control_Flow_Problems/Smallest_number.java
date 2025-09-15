import java.util.*;
public class Smallest_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Is the first number is the largest : YES");
            System.out.println("Is the second number is the largest : NO");
            System.out.println("Is the third number is the largest : NO");
        } else if (b>a && b>c){
            System.out.println("Is the first number is the largest : NO");
            System.out.println("Is the second number is the largest : YES");
            System.out.println("Is the third number is the largest : NO");
        }else{
            System.out.println("Is the first number is the largest : NO");
            System.out.println("Is the second number is the largest : NO");
            System.out.println("Is the third number is the largest : YES");
        }
    }
}
