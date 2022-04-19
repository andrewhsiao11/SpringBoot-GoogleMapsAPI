package com.tts.mapsapp.mapsapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {
    @Value("${api_key}")
    private String apiKey;

    public void addCoordinates(Location location) {
        // call an api call to take city and state stored in location object
        // and use googel geocoding api to get lat a lng
        // and store those in 'location'
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" +
                location.getCity() + "," + location.getState() + "&key=" + apiKey;

        // to make http request inside springboot..
        // create instance of a class called RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        // GeocodingResponse is a class that holds the JSON responce data from APi call
        // to google
        // and then pulling lat and long from that into coordinates
        // and setting location variable to this
        GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
        Location coordinates = response.getResults().get(0).getGeometry().getLocation();
        location.setLat(coordinates.getLat());
        location.setLng(coordinates.getLng());
    }


}


