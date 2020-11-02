/*
Create a variable for the temperature and set it to 80 [X]
Write a statement that outputs the temperature as "The temperature is 80 degrees." [X]
If the temp is greater than 80, output "time to swim" (set temp to 60, 90) and test.[X]
Create a precipitation variable and set it to false.[X]
Only output "time to swim" if temp is greater than 80 and it's not raining.[X]
Set the precipitation variable to "raining" or "snowing" and only output "time to swim" if there is no precipitation.[X]
Create an "indoors" variable and set it to true.[X]
If indoors, then output "time to swim" regardless of the temp and precipitation.[X] */

let temp = 90;
let precipitation = false;
let indoors = false;
let statement = `The temperature is ${temp} degrees`;

if(indoors || !precipitation && temp >= 80){
    console.log('time to swim');
}
console.log(statement);
