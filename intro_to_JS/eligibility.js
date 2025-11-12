// Citizen Eligibility Validator

// Input values
let age = 19;           // you can change this to test
let isCitizen = true;   // true or false

// Eligibility logic using nested if-else and logical operators
if (age >= 18) {
  if (isCitizen) {
    if (age >= 21) {
      console.log("Eligible for all services (vote, drive, passport).");
    } else {
      console.log("Eligible to vote only.");
    }
  } else {
    console.log("Only age criteria met (not a citizen).");
  }
} else {
  console.log(" Not eligible yet.");
}
