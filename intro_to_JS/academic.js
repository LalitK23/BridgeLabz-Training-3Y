// Academic Performance Evaluator

// Input marks for 5 subjects using an array
let marks = [85, 78, 92, 88, 76]; // You can replace these with dynamic inputs if needed

// Validation: if any subject is below 35 → automatically detained
let hasFailed = marks.some(mark => mark < 35);

if (hasFailed) {
  console.log("Result: Detained (One or more subjects below 35 marks)");
} else {
  // Calculate total, average, and percentage
  let total = marks.reduce((sum, mark) => sum + mark, 0);
  let average = total / marks.length;
  let percentage = average.toFixed(2);

  // Evaluate performance using logical operators
  if (percentage >= 85) {
    console.log(`Promoted with Distinction! Percentage: ${percentage}%`);
  } else if (percentage >= 50 && percentage < 85) {
    console.log(` Promoted. Percentage: ${percentage}%`);
  } else {
    console.log(` Detained. Percentage: ${percentage}%`);
  }
}
