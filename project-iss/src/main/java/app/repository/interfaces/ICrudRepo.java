package app.repository.interfaces;

import java.util.List;

/**
 * 
 */
public interface ICrudRepo < E>{


    public Iterable<E> findAll();

    //public E findOne(ID id);


    public void save(E e);


    public void update(E e);


    public void delete(E e);

}