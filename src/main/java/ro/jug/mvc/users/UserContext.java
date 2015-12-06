package ro.jug.mvc.users;

import ro.jug.mvc.entities.User;
import ro.jug.mvc.test.TestDataInserter;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import java.io.Serializable;


@SessionScoped
public class UserContext implements Serializable {

    private static final long serialVersionUID = -7093851207387888951L;

    private User currentUser;

    public UserContext() {
        this.currentUser = TestDataInserter.DEFAULT_USER;
    }

    @Produces
    @LoggedIn
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
