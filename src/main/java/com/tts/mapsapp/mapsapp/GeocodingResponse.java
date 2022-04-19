package com.tts.mapsapp.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}
