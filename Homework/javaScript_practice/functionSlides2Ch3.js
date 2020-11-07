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
        if(this.currentPhotoIndex < this.photoList.length){
            console.log(this.currentPhotoIndex);
            console.log(`you now see a photo of ${this.photoList[this.currentPhotoIndex]}`);
            this.currentPhotoIndex ++;
        }else{
            console.log('end of list');
            this.pause();
        }
    },
    prevPhoto: function(){
        if(this.currentPhotoIndex > 0){
            this.currentPhotoIndex --;
            console.log(`you now see a photo of ${this.photoList[this.currentPhotoIndex]}`);
        }else{
            console.log('start of list');
            this.pause();
        }
    },
    getCurrentPhoto: function(){
        console.log(this.photoList[this.currentPhotoIndex])
        // return list[index];
    },
    playInterval: null,
    play: function() {
        var self = this;
        this.playInterval = setInterval(function(){self.nextPhoto()}, 2000)
    },
    pause: function() {
        clearInterval(this.playInterval);
    }
    
}

slideShow.play();