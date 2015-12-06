package ro.jug.mvc.engine;

import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Posa on 12/6/2015.
 */
@Path("bjug-engine")
@Controller
public class JUGViewController {

    @GET
    public String returnPage() {
        return "home.bjug";
    }

}
