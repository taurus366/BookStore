package api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/")
public class Controller {

	@POST
	@Path("/register")
	public String doRegister(@FormParam("name") String name,@FormParam("secondname") String secondname,@FormParam("password") String password,@FormParam("email") String email,@FormParam("address") String address) {

		

		return name + password + email;

	}
	
	@GET
	@Path("/login")
	public String doLogin(@FormParam("email")String email,@FormParam("password")String password) {
		
		
		return null;
	}
	
	@POST
	@Path("/order")
	public String doOrder(@FormParam("name")String name,@FormParam("secondname")String secondname,@FormParam("phone")String phone) {
		return null;
	}
	
}
