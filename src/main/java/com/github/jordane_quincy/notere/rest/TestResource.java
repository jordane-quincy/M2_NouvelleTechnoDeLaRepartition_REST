package main.java.com.github.jordane_quincy.notere.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import main.java.com.github.jordane_quincy.notere.rest.entity.Personne;

@Path("/test")
public class TestResource {

	@GET
	@Path("/getDefaultPersonne")
	@Produces("application/json")
	public Personne getDefaultPersonne() {
		return new Personne();
	}

	@GET
	@Path("/test")
	@Produces("text/plain")
	public String test() {
		return "test OK";
	}
}
