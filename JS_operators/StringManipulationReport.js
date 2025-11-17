let product = " wireless headphones PRO ";
let cleaned = product.trim().toLowerCase().split(" ").map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(" ");
let finalTitle = cleaned.replace("Pro", "Pro Edition");
console.log(finalTitle);
console.log(finalTitle.length);
