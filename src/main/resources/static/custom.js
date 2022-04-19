let map;
// let coords = { lat: -31.9523, lng: 115.8613 };

function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: coords,
    zoom: 11,
    scrollwheel: false,
  });

let image = {
  url: "/custom_marker.png",
  scaledSize: new google.maps.Size(50, 50),
};

  let marker = new google.maps.Marker({
    position: coords,
    map: map,
    icon: image,
    animation: google.maps.Animation.BOUNCE,
  });

var contentString = "<h2>" + city + ", " + state + "</h2>";


var infowindow = new google.maps.InfoWindow({
  content: contentString,
});

google.maps.event.addListener(marker, "click", function () {
  infowindow.open(map, marker);
});

  
}



// Lyon, France --> lat: 45.7640, lng: 4.8357
// Perth, Aussie --> lat: -31.9523, lng: 115.8613
// North Pole --> lat: 90.0000, lng: -135.0000
