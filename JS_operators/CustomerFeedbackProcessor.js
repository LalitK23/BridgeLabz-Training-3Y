let feedback = "Great product! Fast delivery and amazing sound quality!";
let words = feedback.split(" ").length;
let check = feedback.toLowerCase();

if (check.includes("bad") || check.includes("poor")) {
    console.log("Needs Improvement");
} else {
    console.log("Positive Feedback");
}

console.log("Word Count:", words);
