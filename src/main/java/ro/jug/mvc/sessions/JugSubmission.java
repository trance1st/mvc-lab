package ro.jug.mvc.sessions;

import javax.enterprise.inject.Model;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;


@Model
public class JugSubmission {

    @Size(min = 8, max = 100)
    @FormParam("title")
    private String title;

    @FormParam("description")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
