package com.dio.ansi.controller;

import com.dio.ansi.model.Location;
import com.dio.ansi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }

    @DeleteMapping("/{idLocation}")
    public void deleteLocationById(@PathVariable ("idLocation") Long idLocation) {
        locationService.deleteLocation(idLocation);
    }

    @GetMapping("/{idLocation}")
    public Location findById(@PathVariable ("idLocation") Long idLocation) {
        return locationService.findById(idLocation);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location) {
        return locationService.updateLocation(location);
    }

}
