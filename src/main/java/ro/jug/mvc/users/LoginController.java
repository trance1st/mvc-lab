package ro.jug.mvc.users;

import ro.jug.mvc.entities.User;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.*;

@Controller
@Path("/login")
public class LoginController {

    @Inject
    private UserManager userManager;

    @Inject
    private UserContext userContext;

    @GET
    public String getLoginPage() {
        return "login.jsp";
    };

    @POST
    public String loginUser(@FormParam("username") String username, @FormParam("password") String password) {
        User foundUser = userManager.getUser(username, password);
        if (foundUser == null) {
            return "redirect:/login";
        } else {
            userContext.setCurrentUser(foundUser);
            return "home.jsp";
        }
    }
}
