package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;


@Path("/")
public class Controller {

	@POST
	@Path("/register")
	public String doRegister(@FormParam("name") String name,@FormParam("secondname") String secondname,@FormParam("password") String password,@FormParam("email") String email,@FormParam("address") String address) {
		
		

		return null;

	}
	
	@GET
	@Path("/login")
	
	public Response doLogin(@QueryParam("email") String email, @QueryParam("password") String password) {
		NewCookie cookie = new NewCookie("name", "123");
	    return Response.ok(email+password).cookie(cookie).build();
		
		
	}
	
	@POST
	@Path("/order")
	public String doOrder(@FormParam("name")String name,@FormParam("secondname")String secondname,@FormParam("phone")String phone) {
		return null;
	}
	
}
