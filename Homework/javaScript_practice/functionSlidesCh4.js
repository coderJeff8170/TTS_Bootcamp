/*
Create a single object named "slideshow" that represents the data and functionality of a picture slideshow. There should be NO VARIABLES OUTSIDE THE OBJECT. The object should have properties for:

An array called photoList that contains the names of the photos as strings

An integer currentPhotoIndex that represents which photo in the photoList is currently displayed

A nextPhoto() function that moves currentPhotoIndex to the next index ifthere is one, and:

logs the current photo name.

Otherwise, log "End of slideshow";

A prevPhoto() function that does the same thing, but backwards.

A function getCurrentPhoto() that returns the current photo from the list.
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
        
    }
}
slideShow.nextPhoto();
slideShow.nextPhoto();
slideShow.prevPhoto();
slideShow.prevPhoto();
slideShow.prevPhoto();
