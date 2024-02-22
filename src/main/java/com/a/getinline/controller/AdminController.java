package com.a.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public String adminPlaces(){
        return "admin/places";
    }

    @GetMapping("/places/{placesId}")
    public String adminPlaceDetail(@PathVariable Integer placesId){
        return "admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents(){
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId){
        return "admin/event-detail";
    }
}
