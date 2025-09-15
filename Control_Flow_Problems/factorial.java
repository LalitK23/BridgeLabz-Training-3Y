import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        if(num>0){
            while(num!=0){
                fact=fact*num;
                num--;
            }
        }else{
            System.out.print("The number is not a positive number.");
        }
        System.out.print("The factorial of the given number is : "+fact);
    }
}
