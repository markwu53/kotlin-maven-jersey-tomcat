package hello

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.PathParam

@Path("/hello/{username}")
class HelloService {
    @GET
    @Produces("text/plain")
    fun hello(@PathParam("username") userName: String) = "Hello ${userName}"
}