package org.novik.service;

import org.novik.dto.LocationSummary;
import org.novik.mapper.LocationSummaryMapper;
import org.novik.model.Location;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class LocationService {

    @Inject
    LocationSummaryMapper mapper;

    public List<LocationSummary> getLocations() {
        return mapper.map(Location.listAll());
    }
}
