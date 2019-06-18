package api;

import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/")
public class Controller {

	@POST
	@Path("/register")
	public String GetArticleBYTitle(@FormParam("name") String name,@FormParam("password") String password,@FormParam("email") String email) {

		

		return name + password + email;

	}
}
