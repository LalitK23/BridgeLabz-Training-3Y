import java.util.*;
public class Divisibility_by_5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.print("Is the number "+num+"divisible by 5 ? "+"-- YES");
        }else{
            System.out.print("Is the number "+num+"divisible by 5 ? "+"-- NO");
        }
    }
}
