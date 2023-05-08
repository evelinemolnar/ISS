package app.model;

public class Agent implements Entity<Integer> {

    private Integer id;
    private String username;
    private String password;

    public Agent(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Agent() {

    }

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
