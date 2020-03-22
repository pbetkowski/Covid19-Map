package com.betkowski.demomap.services;

import com.betkowski.demomap.model.Point;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

@Service
public class GeoLiteService {

    private InetAddress retrieveExternalIP() throws IOException {
        URL externalIp = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(
                externalIp.openStream()));
        String ip = in.readLine();
        return InetAddress.getByName(ip);
    }

    private CityResponse loadDb() throws IOException, GeoIp2Exception {
        File database = new File("src/main/resources/db/GeoLite2-City.mmdb");
        DatabaseReader dbReader = new DatabaseReader.Builder(database).build();
        return dbReader.city(retrieveExternalIP());
    }

    public Point getCurrentLocation() throws IOException, GeoIp2Exception {
        CityResponse cityResponse = loadDb();
        return new Point(
                cityResponse.getLocation().getLongitude().toString(),
                cityResponse.getLocation().getLatitude().toString(),
                cityResponse.getCountry().getName());
    }
}
