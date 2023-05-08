package app.repository.interfaces;

import app.model.Product;

import java.util.List;

/**
 * 
 */
public interface ICrudProduct extends ICrudRepo<Product> {


    public Product findByName(String n);

    //public List<Product> orderByPrice();

}