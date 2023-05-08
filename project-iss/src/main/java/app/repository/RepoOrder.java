package app.repository;

import app.model.Order;
import app.repository.interfaces.ICrudOrder;
import org.hibernate.SessionFactory;

public class RepoOrder implements ICrudOrder {

    private SessionFactory sessionFactory;

    public RepoOrder(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Iterable<Order> findAll() {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Order order) {

    }
}
