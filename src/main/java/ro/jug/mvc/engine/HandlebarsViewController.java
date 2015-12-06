package ro.jug.mvc.engine;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Posa on 12/6/2015.
 */
@Path("handlebars")
@Controller
public class HandlebarsViewController {

    @Inject
    private Models models;

    @GET
    public Viewable returnPage() {
        models.put("person", "BJUG");
        return new Viewable("home.hbs", HandlebarsViewEngine.class);
    }
}
