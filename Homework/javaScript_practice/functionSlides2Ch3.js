/*
Going back to our slideshow object, let's add some functionality.

Create an empty property named playInterval[X]

A play() function that moves to the next photo ever 2000ms until the end.

Tip - use playInterval = setInterval(fn,ms).

A pause() function that stops the slideshow

 Tip - use clearInterval(playInterval)

Automatically pause the slideshow if it gets to the end of the photolist while playing.
*/

let slideShow = {
    photoList: ['Jeff', 'Jenn', 'Sophia', 'Granny'],
    currentPhotoIndex: 0,
    nextPhoto: function(){
        if(this.currentPhotoIndex < this.photoList.length-1){
            this.currentPhotoIndex ++;
            console.log(this.currentPhotoIndex);
            console.log(`you now see a photo of ${this.photoList[this.currentPhotoIndex]}`);
        }else{
            console.log('end of list');
        }
    },
    prevPhoto: function(){
        if(this.currentPhotoIndex > 0){
            this.currentPhotoIndex --;
            console.log(`you now see a photo of ${this.photoList[this.currentPhotoIndex]}`);
        }else{
            console.log('start of list');
        }
    },
    getCurrentPhoto: function(){
        console.log(this.photoList[this.currentPhotoIndex])
        // return list[index];
    },
    // playInterval: setInterval(()=>this.play, 2000),
    play: function(){
        do{
            this.nextPhoto();
            
        }while(this.currentPhotoIndex<this.photoList.length);
        // this.nextPhoto();
    },
    pause: clearInterval(this.playInterval)
    
}

slideShow.play();