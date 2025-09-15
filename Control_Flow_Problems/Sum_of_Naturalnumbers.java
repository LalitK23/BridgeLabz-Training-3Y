import java.util.*;
public class Sum_of_Naturalnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a>0){
            int sum = a * (a+1)/2;
            System.out.print("The given number is a positive integer , then the output is "+sum);
        }else{
            System.out.print("The number "+a+" is not a positive integer.");
        }
    }
}
