package de.claudioaltamura.resteasy.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/helloworld")
public class HelloWorldResource
{
   @GET
   @Produces("application/json")
   public HelloWorld greeting(@QueryParam("name") String name)
   {
      return new HelloWorld(name);
   }

}
