class Product {
    constructor(id, name, price, category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    applyDiscount(percent) {
        this.price = this.price - (this.price * (percent / 100));
    }

    getDetails() {
        return `ID: ${this.id}, Name: ${this.name}, Price: ₹${this.price}, Category: ${this.category}`;
    }
}

const p1 = new Product(1, "Smartphone", 15000, "Electronics");
const p2 = new Product(2, "Shoes", 800, "Fashion");
const p3 = new Product(3, "Laptop", 55000, "Electronics");
const p4 = new Product(4, "Watch", 1200, "Accessories");

p1.applyDiscount(10);
p3.applyDiscount(10);

const products = [p1, p2, p3, p4];

const expensiveProducts = products.filter(product => product.price > 1000);

expensiveProducts.forEach(item => {
    console.log(item.getDetails());
});
