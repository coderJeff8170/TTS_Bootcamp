/*Using a for loop:
Write a simple version of "99 bottles of root beer on the wall."[X]
Note: make sure you're logging the result to the console​
Once you get the program running, log "Hey! We need more root beer!" to the console when your counter hits 0.*/

for (let bottles=99; bottles>=0; bottles--){
    if(bottles>0){
        console.log(`${bottles} bottles of beer on the wall`);
    }else{
        console.log("Hey We need more beer!");
    }
}