// Progressive Discount System

// Input: total purchase amount
let totalPurchase = 8500; // You can change this value or take user input

// Initialize discount
let discount = 0;

// Apply discount tiers
if (totalPurchase >= 10000) {
  discount = 25;
} else if (totalPurchase >= 5000) {
  discount = 15;
} else if (totalPurchase >= 2000) {
  discount = 5;
} else {
  discount = 0;
}

// Calculate final price after discount
let discountAmount = (totalPurchase * discount) / 100;
let finalPrice = totalPurchase - discountAmount;

// Round the values
totalPurchase = Math.round(totalPurchase);
discountAmount = Math.round(discountAmount);
finalPrice = Math.round(finalPrice);

// Display summary
console.log(" Progressive Discount Summary 🛍️");
console.log("---------------------------------");
console.log(`Original Total: ₹${totalPurchase}`);
console.log(`Discount Applied: ${discount}%`);
console.log(`Final Price After Discount: ₹${finalPrice}`);
