/*Create a variable billAmount and store a random number (ie: 100)[X]

Create a function gratuity()[X]

gratutity should multiply the value of billAmount by 20% (hint: use 0.2) and return the value[X]

Create a function totalWithGrat()[X]

totalWithGrat should take in the amount as an argument, call the gratutity function, add the returned value to the original bill amount, and return the total bill + gratuity[X]

Append the return value of totalWithGrat to the following phrase: "Your total including gratuity is:" and log it to the console[X]

Only invoke the totalWithGrat function when logging the result[X]

Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)[X]
*/

let billAmount = 100;

function gratuity(amt){
    return amt * .2;
}

function totalWithGrat(amt){
    return `Your total inculding gratuity is: $${(gratuity(amt) + amt).toFixed(2)}`;
}

console.log(totalWithGrat(billAmount));

