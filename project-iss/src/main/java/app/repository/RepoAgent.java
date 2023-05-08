package app.repository;

import app.model.Agent;
import app.repository.interfaces.ICrudAgent;
import app.service.MyException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class RepoAgent implements ICrudAgent {

    private SessionFactory sessionFactory;

    public RepoAgent(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Object findByUsernameAndPassword(String username, String password) throws MyException {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Object angajat = session.createQuery("from Agent where username = :username and parola = :password")
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .uniqueResult();
            session.getTransaction().commit();
            if (angajat == null) {
                throw new MyException("Username sau parola gresita!");
            }
            return angajat;
        }
    }

    @Override
    public Iterable<Agent> findAll() {
        return null;
    }

    @Override
    public void save(Agent agent) {

    }

    @Override
    public void update(Agent agent) {

    }

    @Override
    public void delete(Agent agent) {

    }
}
