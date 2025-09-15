public class discounted_price {
    public static void main(String args[]){
        float fee = 125000;
        float DiscountPercent  = 10;
        float Discount = (DiscountPercent / 100) * fee;
        float finalAmount = fee - Discount;
        System.out.print("The discount amount is INR "+Discount+" and final discounted fee is INR "+finalAmount);
    }
}
