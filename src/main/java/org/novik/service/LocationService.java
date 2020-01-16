package org.novik.service;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.novik.model.Location;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class LocationService {

    public List<Location> getLocations() {
        return Location.listAll();
    }

    public Location getLocation(Long id) {
        return Location.findById(id);
    }

    @Transactional
    public Location createLocation(Location location) {
        location.persist();

        return location;
    }

    @Transactional
    public Location updateLocation(Long id, Location location) {
        Location locationToUpdate = Location.findById(id);
        locationToUpdate.setCity(location.getCity());
        locationToUpdate.setAddress(location.getAddress());
        locationToUpdate.setCountry(location.getCountry());
        locationToUpdate.persist();

        return locationToUpdate;
    }

    @Transactional
    public void deleteLocation(Long id) {
        Location.findByIdOptional(id).ifPresent(PanacheEntityBase::delete);
    }
}
