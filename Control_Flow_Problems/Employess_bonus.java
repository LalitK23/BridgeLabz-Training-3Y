import java.util.Scanner;
public class Employess_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary : ");
        int salary = sc.nextInt();
//        int bonus ;
        System.out.print("Enter the years of service : ");
        int year_of_service = sc.nextInt();
        if(year_of_service > 5){
            double bonus = 0.05*salary;
//            int amount =0 ;
            double amount = salary+bonus;
            System.out.print("The bonus amount is "+amount);
        }else{
            System.out.print("No bonus as your years  of experience is low.");
        }
    }
}
