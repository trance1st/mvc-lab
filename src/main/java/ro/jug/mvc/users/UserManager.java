package ro.jug.mvc.users;

import ro.jug.mvc.entities.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Stateless
public class UserManager {

    @PersistenceContext
    private EntityManager em;

    public List<User> getAllUsers() {
        return em.createNamedQuery("getAllUsers", User.class).getResultList();
    }

    public User getUser(String userName, String password) {
        TypedQuery<User> query = em.createNamedQuery("findUserByNameAndPassword", User.class);
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        try {
            return query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }
}
