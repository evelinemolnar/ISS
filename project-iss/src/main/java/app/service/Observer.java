package app.service;

import app.model.Product;
import app.model.User;

/**
 * 
 */
public interface Observer {

    void update(Product prod);
    void userLoggedIn(User user);
    void userLoggedOut(User user);

}