package org.novik.controller;

import org.novik.model.Location;
import org.novik.service.LocationService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/locations")
@Produces("application/json")
@Consumes("application/json")
public class LocationController {

    @Inject
    LocationService locationService;

    @GET
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @GET
    @Path("/{id}")
    public Location getLocation(@PathParam("id") Long id) {
        return locationService.getLocation(id);
    }

    @POST
    public Location createLocation(Location location) {
        return locationService.createLocation(location);
    }

    @PUT
    @Path("/{id}")
    public Location updateLocation(@PathParam("id") Long id, Location location) {
        return locationService.updateLocation(id, location);
    }

    @DELETE
    @Path("{id}")
    public void deleteLocation(@PathParam("id") Long id) {
        locationService.deleteLocation(id);
    }
}
