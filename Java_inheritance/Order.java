class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return super.getOrderStatus() + ", Shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return super.getOrderStatus() + ", Delivered on " + deliveryDate;
    }
}

class ord {
    public static void main(String[] args) {
        Order o1 = new Order(1001, "2025-09-10");
        ShippedOrder o2 = new ShippedOrder(1002, "2025-09-11", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder(1003, "2025-09-12", "TRK67890", "2025-09-15");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
