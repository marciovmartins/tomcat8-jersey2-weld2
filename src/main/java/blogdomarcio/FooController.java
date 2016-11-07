package blogdomarcio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/foo")
public class FooController {
    @GET
    @Path("/bar")
    public Response getBar() {
        String bar = "foo bar!!!";
        return Response
                .status(Response.Status.OK)
                .entity(bar)
                .build();
    }
}
