package org.novik.controller;

import org.novik.model.Location;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/locations")
public class LocationController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> getLocations() {
        return Location.listAll();
    }
}
