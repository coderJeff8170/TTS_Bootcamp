/*Application Project: Blam! And they’re off! Write a program to find who ran the farthest! We’ll start with a list of the start times when runners started running after the gunshot (in sec): startTimes = [5,7,0,10,4] .
Given another list of speeds (in m/sec): speeds = [1.4, 1.5, .5, 2, 1.2]
(Each position in the lists corresponds with a different runner, i.e. position 0 starts 5 seconds after the race started, and runs at 1.4 meters / second)
Who went the farthest 20 seconds after the start of the race? How about 40 seconds after the start of the race? Assume each iteration of the for  loop is 1 second. (Hint: add the speed of each runner to a new list if the time is > than each runners start time). (Double Hint: You might need 2 for loops for this question.)*/
//
let startTimes = [5,7,0,10,4];

let speeds = [1.4, 1.5, .5, 2, 1.2];

//so, for each speed/person, you'd do a for loop for 20 seconds
//each loop, you would get the m/20s by multiplying speeds[i] x the speed each time, and at the end, you'd subtract the start times
//then you'd have to sort through and figure out which was the smallest # (shortest time)
let distances = [];

//20 sec loop
for(let j=0; j<speeds.length; j++){
    let speed = speeds[j];
    for(let i=1; i<=20; i++){
        speed += i;
    }
    // console.log(speed-startTimes[j]);
    distances.push(speed-startTimes[j]);
}
console.log(distances);
console.log(Math.max(...distances));

let myObject = {
    name: 'Jeff',
    age: 50,
    dog: 'Nilla'
}
//(bracket notation) changes the value of the name key to 'Sophia'
myObject['name'] = 'Sophia';

console.log(myObject.name);// Sophia

//(dot notation) changes the value of name key back to Jeff
myObject.name = 'Jeff';

console.log(myObject.name);// Jeff