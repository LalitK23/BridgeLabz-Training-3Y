// Smart Guessing Game (Number Range)

// Generate random secret number between 1–50
let secretNumber = Math.floor(Math.random() * 50) + 1;

// Test value for user's guess (you can later replace with prompt())
let userGuess = 27;

// Display the secret number (for testing/debugging)
console.log(` Secret Number: ${secretNumber}`);
console.log(` Your Guess: ${userGuess}`);

// Game logic using nested if and logical operators
if (userGuess === secretNumber) {
  console.log(" Correct guess!");
} else {
  if (userGuess >= secretNumber - 3 && userGuess <= secretNumber + 3) {
    console.log("Very close!");
  } else if (userGuess > secretNumber) {
    console.log("Too high!");
  } else {
    console.log(" Too low!");
  }
}
