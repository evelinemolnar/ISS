package app.repository;

import app.model.Entity;

import java.util.List;

/**
 * 
 */
public interface ICrudRepo <ID, E extends Entity<ID>>{

    /**
     * @return
     */
    public List<E> findAll();

    /**
     * @param id 
     * @return
     */
    public E findOne(ID id);

    /**
     * @param e 
     * @return
     */
    public void save(E e);

    /**
     * @param e 
     * @return
     */
    public void update(E e);

    /**
     * @param e 
     * @return
     */
    public void delete(E e);

}