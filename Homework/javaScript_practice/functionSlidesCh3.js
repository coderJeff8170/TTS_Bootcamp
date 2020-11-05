/*
Declare two variables, a and b in the outer function's scope and set them to a string and an object respectively. Log their values immediately.[X]

Log the values of a and b in the inner function.[X]//same at this point

Update the inner function to take two parameters named a and b.//now logs in inner function are undefined[X]

Pass a and b in as arguments when you execute inner().//expect them to reappear - yup[X]

Inside the inner function, assign new values to a and b and log them at the end of the function AND after the execution of inner(a,b).//inner scope arg variables go out of scope after end of curly braces[X]

Inside the inner function, update a property of the b object.
updates only inside inner function[X]
*/

function outer(){
    let a='Jeff';
    let b={
        name: 'Sophia'
    }
    console.log(a);
    console.log(b);
  
    function inner(a, b) {
        console.log(a);
        console.log(b);
     a='Jenn';
     b={ name: 'Nilla' }
     b.name='Marley'
     console.log(a);
     console.log(b);
    }
   
    inner(a, b);
    console.log(a);
     console.log(b);
  }
   
  outer();
  