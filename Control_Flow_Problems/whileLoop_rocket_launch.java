import java.util.*;
public class whileLoop_rocket_launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        while(num!=0){
            System.out.println(num);
            num--;
        }
    }
}
