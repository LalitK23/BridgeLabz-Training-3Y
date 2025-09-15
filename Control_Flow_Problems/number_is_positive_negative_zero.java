import java.util.*;
public class number_is_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num<0){
            System.out.print("Negative");
        } else if (num>0) {
            System.out.print("positive");
        }else{
            System.out.print("Zero");
        }
    }
}
