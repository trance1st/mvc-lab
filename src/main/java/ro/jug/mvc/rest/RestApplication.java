package ro.jug.mvc.rest;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;


@ApplicationPath("/app")
public class RestApplication extends Application {

    @Override
    public Map<String, Object> getProperties() {
        final Map<String, Object> map = new HashMap<>();

        map.put(Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.EXPLICIT);
        return map;
    }

}
