package ro.jug.mvc.engine;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.engine.Priorities;
import javax.mvc.engine.ViewEngine;
import javax.mvc.engine.ViewEngineContext;
import javax.mvc.engine.ViewEngineException;
import javax.servlet.ServletContext;
import java.io.*;
import java.util.stream.Collectors;

/**
 * Created by Posa on 12/6/2015.
 */
@Priority(Priorities.DEFAULT)
public class HandlebarsViewEngine implements ViewEngine {

    @Inject
    private ServletContext servletContext;

    @Override
    public boolean supports(String view) {
        return view.endsWith(".hbs");
    }

    @Override
    public void processView(ViewEngineContext context) throws ViewEngineException {

        Models models = context.getModels();
        String viewName = context.getView();
        viewName = "/WEB-INF/views/" + viewName;

        try (PrintWriter writer = context.getResponse().getWriter();
             InputStream rs = servletContext.getResourceAsStream(viewName);
             InputStreamReader in = new InputStreamReader(rs, "UTF-8");
             BufferedReader buf = new BufferedReader(in)) {

            String viewContent = buf.lines().collect(Collectors.joining());

            Handlebars handlebars = new Handlebars();
            Template template = handlebars.compileInline(viewContent);
            template.apply(models, writer);

        } catch (IOException e) {
            throw new ViewEngineException(e);
        }

    }
}