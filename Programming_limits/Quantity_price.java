import java.util.*;
public class Quantity_price {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price of te product you are buying : ");
        float price = sc.nextFloat();
        System.out.print("Enter the quantity you are buying : ");
        int q = sc.nextInt();
        float t_price = price * q;
        System.out.print("The total purchase price is INR "+t_price+" if the quantity is "+q+" and unit price is INR "+price);
    }
}
