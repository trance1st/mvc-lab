package ro.jug.mvc.engine;

import javax.mvc.Models;
import javax.mvc.engine.ViewEngine;
import javax.mvc.engine.ViewEngineContext;
import javax.mvc.engine.ViewEngineException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Posa on 12/6/2015.
 */
public class JUGViewEngine implements ViewEngine {
    public JUGViewEngine() {
    }

    public boolean supports(String view) {
        return view.endsWith(".bjug");
    }

    public void processView(ViewEngineContext context) throws ViewEngineException {
        Models models = context.getModels();
        try (PrintWriter writer = context.getResponse().getWriter()) {
            writer.write("Processing result here");
        } catch (IOException e) {
            throw new ViewEngineException(e);
        }
    }
}

