// Weather Activity Planner

// Create variables
let temperature = 28;   
let isRaining = false; 
let windSpeed = 15;     

// Decision logic using && and || operators
if (isRaining) {
  console.log(" Stay indoors with hot coffee.");
} 
else if (temperature > 35 && !isRaining) {
  console.log(" It's hot outside! Go swimming.");
} 
else if (temperature < 15 && windSpeed > 20) {
  console.log(" Too cold and windy — stay home.");
} 
else if ((temperature >= 15 && temperature <= 35) && (!isRaining || windSpeed < 25)) {
  console.log(" Perfect day for a walk!");
} 
else {
  console.log(" Weather is unpredictable — plan carefully!");
}
