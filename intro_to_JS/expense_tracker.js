// Monthly Expense Tracker

// Array of expenses for 5 categories
let expenses = {
  food: 5000,
  travel: 2000,
  rent: 8000,
  bills: 2500,
  leisure: 1500
};

// Calculate total expenses
let total = expenses.food + expenses.travel + expenses.rent + expenses.bills + expenses.leisure;

// Calculate average expense
let average = total / Object.keys(expenses).length;

// Add 10% tax to total
let taxRate = 0.10;
let totalAfterTax = total + (total * taxRate);

// Round values to 2 decimal places
total = total.toFixed(2);
average = average.toFixed(2);
totalAfterTax = totalAfterTax.toFixed(2);

// Display results
console.log(" Monthly Expense Tracker Summary 💸");
console.log("------------------------------------");
console.log(`Total Expenses: ₹${total}`);
console.log(`Average Expense: ₹${average}`);
console.log(`Final Amount After 10% Tax: ₹${totalAfterTax}`);
