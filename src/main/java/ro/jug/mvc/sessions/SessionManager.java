package ro.jug.mvc.sessions;

import ro.jug.mvc.entities.JugSession;
import ro.jug.mvc.entities.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Stateless
public class SessionManager {

    @PersistenceContext
    private EntityManager em;

    public List<JugSession> getAllSessions() {
        return em.createNamedQuery("getAllSessions", JugSession.class).getResultList();
    }

    public List<JugSession> getSessionsForUser(User user) {
        TypedQuery<JugSession> query = em.createNamedQuery("findSessionsByUser", JugSession.class);
        query.setParameter("user", user);
        return query.getResultList();
    }

    public JugSession submitSession(JugSession newSession) {
        em.persist(newSession);
        return newSession;
    }
}
