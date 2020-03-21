package com.betkowski.demomap.services;

import com.betkowski.demomap.Endpoints;
import com.betkowski.demomap.model.Location;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {


    public Location loadCountryDetails() {
        RestTemplate restTemplate = new RestTemplate();
        Location location = restTemplate
                .getForObject(Endpoints.API_URL, Location.class);
        System.out.println(location);
        return location;
    }

}
