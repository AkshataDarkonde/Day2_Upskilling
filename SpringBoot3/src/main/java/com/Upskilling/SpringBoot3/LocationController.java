package com.Upskilling.SpringBoot3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/{zipcode}")
    public Location getLocationByZipcode(@PathVariable String zipcode){
        return locationService.getLocationByZipcode(zipcode);
    }
}
