package app.repository.interfaces;

import app.model.Admin;
import app.service.MyException;

public interface ICrudAdmin extends ICrudRepo<Admin> {

    public Object findByUsernameAndPassword(String username, String password) throws MyException;
}
