package app.service;

import app.model.Admin;
import app.model.Agent;
import app.model.Product;
import app.repository.RepoAdmin;
import app.repository.RepoAgent;
import app.repository.RepoOrder;
import app.repository.RepoProduct;
import app.repository.interfaces.ICrudAdmin;
import app.repository.interfaces.ICrudAgent;
import app.repository.interfaces.ICrudOrder;
import app.repository.interfaces.ICrudProduct;
import org.hibernate.SessionFactory;

import java.util.List;
/**
 * 
 */
public class Service {
    private static Service instance;


    public Service(RepoAgent agentRepo, RepoAdmin adminRepo, RepoProduct productRepo, RepoOrder orderRepo) {
        this.agentRepo=agentRepo;
        this.adminRepo=adminRepo;
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }


    private final ICrudProduct productRepo;
    private final ICrudAdmin adminRepo;
    private final ICrudAgent agentRepo;
    private final ICrudOrder orderRepo;

    public static Service getInstance(SessionFactory sessionFactory){
        if(instance == null){
            instance = new Service(new RepoAgent(sessionFactory),
                    new RepoAdmin(sessionFactory),
                    new RepoProduct(sessionFactory),
                    new RepoOrder(sessionFactory));
        }
        return instance;
    }


    public Object login(String username, String password) throws MyException{
        Object user = null;
        try{
            user = adminRepo.findByUsernameAndPassword(username, password);
        } catch(MyException e){
            try{
                user = agentRepo.findByUsernameAndPassword(username, password);
            } catch(MyException ex){
                throw ex;
            }
        }
        return user;
    }

    public Iterable<Admin> getAllAdmini(){
        return adminRepo.findAll();
    }

}