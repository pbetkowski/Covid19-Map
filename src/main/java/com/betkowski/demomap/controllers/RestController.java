package com.betkowski.demomap.controllers;

import com.betkowski.demomap.model.Location;
import com.betkowski.demomap.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private MapService mapService;

    @GetMapping(value = "/loadCountryDetails")
    public Location loadData() {
        return mapService.loadCountryDetails();
    }
}
