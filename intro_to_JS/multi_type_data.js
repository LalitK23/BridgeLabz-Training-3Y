// Multi-Type Data Summary

// Declare variables of different data types
let userName = "Krish";             
let userAge = 21;                  
let isLoggedIn = true;             
let hobbies = ["Riding", "Coding"];
let userDetails = { city: "Mathura", country: "India" };
let accountStatus = null;          
let lastLogin;                     

// Prepare summary data
let summary = [
  { Label: "User Name", Value: userName, Type: typeof userName },
  { Label: "User Age", Value: userAge, Type: typeof userAge },
  { Label: "Is Logged In", Value: isLoggedIn, Type: typeof isLoggedIn },
  { Label: "Hobbies", Value: hobbies, Type: Array.isArray(hobbies) ? "array" : typeof hobbies },
  { Label: "User Details", Value: userDetails, Type: typeof userDetails },
  { Label: "Account Status", Value: accountStatus, Type: typeof accountStatus },
  { Label: "Last Login", Value: lastLogin, Type: typeof lastLogin }
];

// Display formatted report
console.table(summary);
