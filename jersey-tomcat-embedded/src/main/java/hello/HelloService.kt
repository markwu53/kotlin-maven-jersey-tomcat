package hello

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/greeting")
class HelloService {
    @GET
    @Produces("text/plain")
    fun greeting() = "greeting again"
}