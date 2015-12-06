package ro.jug.mvc.sessions;

import javax.enterprise.inject.Model;


@Model
public class MessagesBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
