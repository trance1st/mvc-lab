package ro.jug.mvc.event;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.mvc.event.BeforeControllerEvent;
import javax.mvc.event.BeforeProcessViewEvent;
import java.util.logging.Logger;

/**
 * Created by sapo on 12/6/2015.
 */
@ApplicationScoped
public class CountObserver {

    private static final Logger LOGGER = Logger.getLogger(CountObserver.class.getName());

    private void onControllerMatched(@Observes BeforeControllerEvent event) {
        LOGGER.info(() -> "Controller " + event.getResourceInfo().getResourceClass().getName() + " matched for " + event.getUriInfo().getRequestUri());
    }

    private void onViewEngineSelected(@Observes BeforeProcessViewEvent event) {
        LOGGER.info(() -> "View engine: " + event.getEngine());
    }

    @PostConstruct
    private void init() {
        LOGGER.config(() -> this.getClass().getSimpleName() + " created");
    }
}
