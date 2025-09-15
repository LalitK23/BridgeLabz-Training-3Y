import java.util.*;
public class Km_to_miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kms : ");
        double km = sc.nextDouble();
        double miles = 1.6 * km;
        System.out.print("The total miles is "+miles+" mile for the given "+km+" km");
    }
}
