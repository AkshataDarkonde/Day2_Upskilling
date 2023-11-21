package com.Upskilling.SpringBoot3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location getLocationByZipcode(String zipcode){
        return locationRepository.findById(zipcode).orElse(null);
    }
}
