// Personalized Login Greeting Program

// Declare variables
let userName = prompt("Enter your name: ");
let currentHour = new Date().getHours();

// Determine greeting based on time
let greeting;

if (currentHour < 12) {
  greeting = `Good Morning, ${userName}!`;
} else if (currentHour >= 12 && currentHour < 17) {
  greeting = `Good Afternoon, ${userName}!`;
} else {
  greeting = `Good Evening, ${userName}!`;
}

// Display greeting
alert(greeting);
console.log(greeting);
