import java.util.*;
public class Area_triangle {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cms : ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the triangle in cms : ");
        float height = sc.nextFloat();
        float base_inch = (float)0.394 * base;
        float height_inch = (float)0.394 * height;
        float area_cm = (float)0.5 * base * height;
        float area_inches = (float)0.5 * base_inch * height_inch;
        System.out.print("The area of triangle in square cms is "+area_cm+" and in square inches is "+area_inches);
    }
}
