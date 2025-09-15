import java.util.*;
public class SumUntilZero_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter numbers to add (Enter 0 to stop):");
        number = sc.nextDouble();
        while (number != 0) {
            total += number;
            System.out.println("Enter another number or enter 0 to stop :");
            number = sc.nextDouble();
            if(number<0){
                break;
            }
        }
        System.out.println("Total sum = " + total);
    }
}
