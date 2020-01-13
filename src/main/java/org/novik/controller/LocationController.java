package org.novik.controller;

import org.novik.dto.LocationSummary;
import org.novik.service.LocationService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/locations")
public class LocationController {

    @Inject
    LocationService locationService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<LocationSummary> getLocations() {
        return locationService.getLocations();
    }
}
