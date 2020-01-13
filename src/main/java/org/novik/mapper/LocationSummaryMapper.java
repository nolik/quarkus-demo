package org.novik.mapper;

import org.novik.dto.LocationSummary;
import org.novik.model.Location;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LocationSummaryMapper {

    public LocationSummary map(Location location) {
        return new LocationSummary(
                location.getName(),
                location.getName(),
                location.getAddress(),
                location.getCity(),
                location.getCountry());
    }

    public List<LocationSummary> map(List<Location> locations) {
        return locations.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
