// Random Math Quiz Generator

// Generate two random numbers between 1–20
let num1 = Math.floor(Math.random() * 20) + 1;
let num2 = Math.floor(Math.random() * 20) + 1;

// List of operators
let operators = ['+', '-', '*', '/'];

// Randomly pick an operator
let randomOperator = operators[Math.floor(Math.random() * operators.length)];

// Variable to store correct answer
let correctAnswer;

// Use switch to calculate based on the operator
switch (randomOperator) {
  case '+':
    correctAnswer = num1 + num2;
    break;
  case '-':
    correctAnswer = num1 - num2;
    break;
  case '*':
    correctAnswer = num1 * num2;
    break;
  case '/':
    correctAnswer = (num1 / num2).toFixed(2); // Round division to 2 decimals
    break;
  default:
    console.log("Invalid operator!");
    break;
}

// Display question and answer
console.log(" Random Math Quiz ");
console.log(`Question: ${num1} ${randomOperator} ${num2} = ?`);
console.log(`Correct Answer: ${correctAnswer}`);
