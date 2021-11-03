package com.dio.ansi.service;

import com.dio.ansi.exception.LocationNotFoundException;
import com.dio.ansi.model.Location;
import com.dio.ansi.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public void deleteLocation(Long idLocation) {
        locationRepository.deleteById(idLocation);
    }

    public Location findById(Long idLocation) {
        return locationRepository.findById(idLocation).orElseThrow(() -> new LocationNotFoundException(idLocation));
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }
}
