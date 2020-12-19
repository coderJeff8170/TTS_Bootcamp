var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
		center: userCoords,
		zoom: 15,
		scrollwheel: false
	});
	
	//make a bus icon
	var busImage = {url: '/busMarker.png', 
			scaledSize: new google.maps.Size(50, 50)};
			
	//show all the bus locations via a marker for each one:
	for (let i=0; i<busLocations.length; i++){
	
		let contentString = `Bus number ${busLocations[i].ROUTE}`;

		let infowindow = new google.maps.InfoWindow({
		   content: contentString
		});
	
		
	
		let marker = new google.maps.Marker({
		    position: { lat: parseFloat(busLocations[i].LATITUDE), lng: parseFloat(busLocations[i].LONGITUDE) },
		    map: map,
		    icon: busImage
		});
		
		google.maps.event.addListener(marker, 'click', function() {
		   infowindow.open(map,marker);
		});
		
	}
	
	//show the person marker
	
	//make an image first:
	var image = {url: '/custom_marker.png', 
			scaledSize: new google.maps.Size(50, 50)};
			
	//create the marker:
	var personMarker = new google.maps.Marker({
		    position: userCoords,
		    map: map,
		    icon: image,
	    	animation: google.maps.Animation.BOUNCE
		});
	
	//center: { lat: parseFloat(busLocations[0].LATITUDE), lng: parseFloat(busLocations[0].LONGITUDE) }
	//position: { lat: parseFloat(personLocation.LATITUDE), lng: parseFloat(personLocation.LONGITUDE) }
}

