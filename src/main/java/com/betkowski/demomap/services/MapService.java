package com.betkowski.demomap.services;

import com.betkowski.demomap.Endpoints;
import com.betkowski.demomap.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {

    public Location loadCountryDetails() {
        return new RestTemplate().getForObject(Endpoints.API_URL, Location.class);
    }

}
