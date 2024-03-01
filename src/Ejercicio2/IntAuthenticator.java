package Ejercicio2;

public interface IntAuthenticator {

    public String getUser();
    public void setUser(String user);
    public String getPassword();
    public void setPassword(String password);
    public boolean authenticate(String user, String password);
}
