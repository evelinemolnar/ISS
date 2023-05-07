package app.repository;

import app.model.User;

/**
 * 
 */
public interface ICrudUser extends ICrudRepo<String, User> {


    /**
     * @param u
     * @return
     */
    public User findByUsername(String u);

}