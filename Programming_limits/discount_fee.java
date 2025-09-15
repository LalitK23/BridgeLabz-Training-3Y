import java.util.*;
public class discount_fee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fee : ");
        float fee =sc.nextFloat();
        System.out.print("Enter the discount given by the institution : ");
        float DiscountPercent  = sc.nextFloat();
        float Discount = (DiscountPercent / 100) * fee;
        float finalAmount = fee - Discount;
        System.out.print("The discount amount is INR "+Discount+" and final discounted fee is INR "+finalAmount);
    }
}
