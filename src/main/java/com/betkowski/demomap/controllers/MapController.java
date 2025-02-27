package com.betkowski.demomap.controllers;

import com.betkowski.demomap.model.Point;
import com.betkowski.demomap.services.GeoLiteService;
import com.betkowski.demomap.services.MapService;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    @Autowired
    private GeoLiteService geoLiteService;

    @GetMapping
    public String loadVirusData(Model model) throws IOException, GeoIp2Exception {
        List<Point> points = new ArrayList<>();

        Point currentLocation = geoLiteService.getCurrentLocation();

        mapService.loadCountryDetails().getLocations().forEach(location -> {
            points.add(new Point(location.getCoordinates().getLatitude(), location.getCoordinates().getLongitude(), location.getCountry(), location.getLatest().getConfirmed(), location.getLatest().getDeaths(), location.getLatest().getRecovered()));
        });
        model.addAttribute("points", points);
        model.addAttribute("currentLocation", currentLocation);
        return "map";
    }
}
