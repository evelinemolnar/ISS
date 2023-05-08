package app.model;


public interface Entity<ID>{

    ID getId();

    void setId(ID id);
}