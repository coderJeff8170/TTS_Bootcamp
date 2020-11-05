/*Challenge 2

Define a hands array with the values 'rock', 'paper', and 'scissors' [X]
Define a function getComputerHand() that returns a hand from the array using parseInt(Math.random()*10) % 3)[X]
Define a function called compare() that
Takes two choices as arguments[X]
Determines the winner[X]
Logs the hands played by each[X]
Returns a string indicating the result[X]
Play a game[X]
*/
let hands = [ 'rock', 'paper', 'scissors'];

function getComputerHand(arr){
    let hand = [];
    for(i=0; i<2; i++){
        hand.push(arr[parseInt(Math.random()*10 % 3)]);
    }
        return hand;
}

function compare (hand) {
    console.log(`player 1: ${hand[0]} Player 2: ${hand[1]}`)
    
    //compare hand one to hand two
    if(hand[0]===hand[1]){
        console.log("it's a draw!");
    } else if (hand[0] === 'scissors') {
        switch(hand[1]){
            case 'rock':
                console.log('rock beats scissors! Player 2 wins!');
                break;
            case 'paper':
                console.log('scissors beats paper! Player 1 wins!');
                break;
        }
    }else if(hand[0]==='paper'){
        switch(hand[1]){
            case 'rock':
                console.log('paper beats rock! Player 1 wins!');
                break;
            case 'scissors':
                console.log('scissors beats paper! Player 2 wins!');
                break;
        }
    }else{
        switch(hand[1]){
            case 'paper':
                console.log('paper beats rock! Player 2 wins!');
                break;
            case 'scissors':
                console.log('scissors beats paper! Player 1 wins!');
                break;
        }
    }
}

function startGame(){
    //pyramid of doom!
    setTimeout(()=>{console.log('rock');
        setTimeout(()=>{console.log('paper');
            setTimeout(()=>{console.log('scissors...');
                setTimeout(()=>{
                    //run stuff here
                    runGame();}
                    , 1000)}
                ,1000)}
            ,1000)}
        ,1000);
}

function runGame(){
    let hand = getComputerHand(hands);
    compare(hand);
}

startGame();
// console.log(getComputerHand(hands));

