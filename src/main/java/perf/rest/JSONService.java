package perf.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import perf.Track;

@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrackInXML() {
		List<Track> tracks = new ArrayList<Track>();
		for (int i = 0; i < 5; i++) {
			Track track = new Track();
			track.setTitle("Enter Sandman");
			track.setSinger("Metallica");
			tracks.add(track);
		}

		return tracks;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}