package com.tts.mapsapp.mapsapp;

import lombok.Data;

@Data
public class Location {
    // we fill these in
    private String city;
    private String state;
    // from JSON - gets filled in 
    private String lat;
    private String lng;
}
