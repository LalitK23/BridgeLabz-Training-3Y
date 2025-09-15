import java.util.*;
public class perimeter_of_square {
    public static void main(String[] args){
        System.out.print("Enter the perimeter of the square : ");
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        float side = (float)perimeter/4;
        System.out.print("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}
