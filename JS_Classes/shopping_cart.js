class Cart {
    constructor() {
        this.items = [];
        this.coupon = "";
    }

    addItem(name, price, qty) {
        this.items.push({ name, price, qty });
    }

    getTotal() {
        return this.items.reduce((sum, item) => {
            return sum + item.price * item.qty;
        }, 0);
    }

    applyCoupon(code) {
        let regex = /^(SAVE|DISC)(\d{1,2})$/;
        if (regex.test(code)) {
            this.coupon = code;
            let discountPercent = parseInt(code.match(/\d+/)[0]);
            let total = this.getTotal();
            let finalTotal = total - (total * (discountPercent / 100));
            console.log(`Coupon Applied: ${discountPercent}% OFF`);
            console.log(`Final Total: ₹${finalTotal}`);
        } else {
            console.log("Invalid Coupon Code");
        }
    }
}

const cart = new Cart();

cart.addItem("Shoes", 1200, 1);
cart.addItem("T-Shirt", 600, 2);
cart.addItem("Watch", 1500, 1);

console.log("Cart Total:", cart.getTotal());

cart.applyCoupon("SAVE20");
