//1. Write a JavaScript program that accept two integers and display the larger.[X]

let isGreaterThan = (a, b) => {
    if(a>b){
        return a;
    }else{
        return b;
    }
}

console.log(isGreaterThan(55, 45)); //55

//2.Write a JavaScript conditional statement to find the sign of product of three numbers. Display an alert box with the specified sign. Go to the editor
//Sample numbers : 3, -7, 2
//Output : The sign is -

let findSign = (a, b, c) => {
    let product = a * b * c;
    if(typeof product === !Number){
        console.log("Sorry, something went wrong");
    }
    if(product>0){
        console.log('The sign is positive');
    }else if (product<0){
        console.log('The sign is negative');
    }else{
        console.log('The sign is neither negative or positive because the number is 0');
    }
}

findSign(3, -7, 2);//The sign is negative

//3. Write a JavaScript conditional statement to sort three numbers. Display an alert box to show the result. Go to the editor
//Sample numbers : 0, -1, 4
//Output : 4, 0, -1



let biggestOfThree = (a, b, c) => {
    if(a>b && b>c){
        console.log(a, b, c);
    }else if(a>b && b<c){
        if(a>c){
            console.log(a, c, b);
        }else{
            console.log(c, a, b);
        }
    }else if(b>a && a>c){
        if(b>c){
            console.log(b, a, c);
        }else{
            console.log(b, c, a);
        }
    }else{
        console.log(c, b, a);
    }
}

biggestOfThree(0, -1, 4);

// 4. Write a JavaScript conditional statement to find the largest of five numbers. Display an alert box to show the result. Go to the editor
// Sample numbers : -5, -2, -6, 0, -1
// Output : 0

// let myArray = [-5, -2, -6, 0, -1];

// for(let i=0; i<myArray.length; i++){
//     if(myArray[i]<myArray[i+1]){

//     }
// }

// 5. Write a JavaScript for loop that will iterate from 0 to 15. For each iteration, it will check if the current number is odd or even, and display a message to the screen. 

for(let i=0; i<=15; i++){
    if(i%2===0){
        console.log(`${i} is even!`);
    }else{
        console.log(`${i} is odd`);
    }
}