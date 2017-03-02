package main.java.com.github.jordane_quincy.notere.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/ApplicationREST")
public class ApplicationREST extends Application {

	public Set<Class<?>> getClases() {
		final Set<Class<?>> s = new HashSet<>();
		s.add(TestResource.class);

		return s;
	}
}
