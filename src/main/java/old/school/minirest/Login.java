package old.school.minirest;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/login")
public class Login {

    @Context
    private HttpServletRequest httpRequest;

    @GET
    @Produces(MediaType.TEXT_PLAIN)    
    public String login(){
        HttpSession session = httpRequest.getSession();
        String sessionId = session.getId();
        return sessionId;
    }
}
