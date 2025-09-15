import java.util.*;
public class height_in_foots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters : ");
        float height = sc.nextFloat();
        double inches = 0.394 * height;
        int foot = (int)inches / 12;
        int r_inches = (int)inches % 12;
        System.out.print("Your Height in cm is "+height+" while in feet is "+foot+" and inches is "+r_inches);
    }
}
