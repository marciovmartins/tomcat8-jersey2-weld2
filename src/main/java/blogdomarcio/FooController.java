package blogdomarcio;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/foo")
public class FooController {
    @Inject
    Foo foo;

    @GET
    @Path("/bar")
    public Response getBar() {
        String bar = foo.bar();
        return Response
                .status(Response.Status.OK)
                .entity(bar)
                .build();
    }
}
