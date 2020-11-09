package SEP.Models;

public class User {
    private int Id;
    private String Username;
    private String Password;
    private int SecurityLevel;

    public User() {
    }

    public User(int id, String username, String password, int securityLevel) {
        Id = id;
        Username = username;
        Password = password;
        SecurityLevel = securityLevel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getSecurityLevel() {
        return SecurityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        SecurityLevel = securityLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", SecurityLevel=" + SecurityLevel +
                '}';
    }
}
