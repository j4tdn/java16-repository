package bean;

public class AccountRegister {
    private String username;
    private String password;

    public AccountRegister() {
    }

    public AccountRegister(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null || username == ""){
            throw new IllegalArgumentException("Cannot be null");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.equals("")){
            throw new IllegalArgumentException("Cannot be null");
        }
        this.password = password;
    }


}
