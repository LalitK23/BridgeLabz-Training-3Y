import java.util.*;
public class distance_in_yards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in  feets : ");
        float feets = sc.nextFloat();
        float yards = feets/3;
        float miles = yards/1760;
        System.out.print("The distance in yards is "+yards+" and in miles is "+miles);
    }
}
