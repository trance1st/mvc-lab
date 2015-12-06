package ro.jug.mvc.home;

import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Ivan St. Ivanov
 */
@Controller
@Path("/")
public class HomeController {

    @GET
    public String showIndexPage() {
        return "home.jsp";
    }
}
