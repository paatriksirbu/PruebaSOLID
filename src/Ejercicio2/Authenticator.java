package Ejercicio2;

public class Authenticator {
    private String user;
    private String password;

    public Authenticator(String user, String password) {    //Constructor para que el usuario pueda introducir su usuario y contrasena
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("La contrasena no es valida");
        }
    }

    private boolean isValidPassword(String password) {  //Creamos un metodo para que el usuario pueda introducir su contrasena con letras, numeros y caracteres.
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
        return password.matches(regex);
    }

    public boolean authenticate(String user, String password) {
        return this.user.equals(user) && this.password.equals(password);
    }
}
