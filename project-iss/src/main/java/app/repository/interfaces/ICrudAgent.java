package app.repository.interfaces;

import app.model.Agent;
import app.service.MyException;

/**
 * 
 */
public interface ICrudAgent extends ICrudRepo<Agent> {


    public Object findByUsernameAndPassword(String username, String password) throws MyException;

}