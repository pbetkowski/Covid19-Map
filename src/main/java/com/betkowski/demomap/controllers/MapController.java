package com.betkowski.demomap.controllers;

import com.betkowski.demomap.model.Point;
import com.betkowski.demomap.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping
    public String loadVirusData(Model model) {
        List<Point> points = new ArrayList<>();

        mapService.loadCountryDetails().getLocations().forEach(location -> {
            points.add(new Point(location.getCoordinates().getLatitude(), location.getCoordinates().getLongitude(), location.getCountry(), location.getLatest().getConfirmed(), location.getLatest().getDeaths(), location.getLatest().getRecovered()));
        });
        model.addAttribute("points", points);
        System.out.println("OUTPUT: " + points);
        return "map";

    }
}
