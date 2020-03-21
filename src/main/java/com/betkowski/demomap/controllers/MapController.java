package com.betkowski.demomap.controllers;

import com.betkowski.demomap.model.Point;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {


    @GetMapping
    public String loadPoint(Model model) {
        model.addAttribute("pt", new Point(54.51, 18.53, "Hello World"));
        return "map";
    }



}
