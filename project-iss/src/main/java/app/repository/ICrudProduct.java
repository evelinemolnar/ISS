package app.repository;

import app.model.Product;

import java.util.List;

/**
 * 
 */
public interface ICrudProduct extends ICrudRepo<String, Product> {


    /**
     * @param n
     * @return
     */
    public Product findByName(String n);

    /**
     * @return
     */
    public List<Product> orderByPrice();

}