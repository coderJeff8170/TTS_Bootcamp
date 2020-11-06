/*Create an Array named superHeroes shown above[X]
Create a secretIdentity variable[X]
Assign superHeroes.map() to the secretIdentity variable[X]
Assign an anonymous function to superheroes.map() as an argument[X]
Your anonymous function should have one parameter named revealArray[X]
Inside the block of your anonymous function:
You'll be working with revealArray as an argument
Using revealArray, return a string that will join the two array items.[X]
join them together with the string "is" (ie: "Batman is Bruce Wayne")[X]
Log the results to the screen and join them with a line break.[X]
*/


let superHeroes = [
    ["Batman", "Bruce Wayne"],
    ["Spiderman", "Peter Parker"],
    ["The Flash", "Barry Allen"]
  ];

// let secretIdentity = superHeroes.map((revealArray)=>{`${revealArray[0]} is ${revealArray[1]}`});
// let secretIdentity = superHeroes.map(el => el[0] + ' is ' + el[1]);
let secretIdentity = superHeroes.map(revealArray => `${revealArray[0]} is ${revealArray[1]}`);
console.log(secretIdentity.join("\n"));

