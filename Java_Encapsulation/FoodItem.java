import java.util.ArrayList;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discount + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 50; // Extra charge for non-veg

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + extraCharge) * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + discount + "%";
    }
}



class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        VegItem veg1 = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 300, 1);

        veg1.applyDiscount(10);
        nonVeg1.applyDiscount(5);

        order.add(veg1);
        order.add(nonVeg1);

        double totalBill = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("--------------------------");
            totalBill += item.calculateTotalPrice();
        }
        System.out.println("Total Order Bill: " + totalBill);
    }
}
