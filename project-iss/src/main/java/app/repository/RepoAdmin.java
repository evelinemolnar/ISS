package app.repository;

import app.model.Admin;
import app.repository.interfaces.ICrudAdmin;
import app.service.MyException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class RepoAdmin implements ICrudAdmin {
    private SessionFactory sessionFactory;

    public RepoAdmin(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    public Object findByUsernameAndPassword(String username, String password) throws MyException {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Object admin = session.createQuery("from Admin where username = :username and password = :password")
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .uniqueResult();
            session.getTransaction().commit();
            if (admin == null) {
                throw new MyException("Username sau parola gresita!");
            }
            return admin;
        }
    }

    @Override
    public Iterable<Admin> findAll() {
        return null;
    }


    @Override
    public void save(Admin admin) {
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();
            session.save(admin);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(Admin admin) {

    }
}
