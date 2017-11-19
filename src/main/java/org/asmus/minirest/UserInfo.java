package org.asmus.minirest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("UserInfoService")
public class UserInfo {

    @GET
    @Path("/hier")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        
        List<User> results = new ArrayList<User>();
        
        
        User u = new User();
        
        results.add(u);
        results.add(u);
        
        GenericEntity<List<User>> r = new GenericEntity<List<User>>(results){ };
        
        return Response.ok(r).build();
    }
    
    @GET
    @Path("/name/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public User userName(@PathParam("i") String i) {
        String name = i;
        return new User();
    }

    @GET
    @Path("/age/{j}")
    @Produces(MediaType.TEXT_XML)
    public String userAge(@PathParam("j") int j) {
        int age = j;
        return "<User>" + "<Age>" + age + "</Age>" + "</User>";
    }
}
