package Ejercicio2;

import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private String address;
    private int phone;
    private String email;

    private Authenticator authenticator;

    public User(int id, String name, String address, int phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public User() {
        this.authenticator = new Authenticator("username", "password");
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    public void crearUsuario() {    // Método para crear un usuario y autenticarlo
        Scanner sc = new Scanner(System.in);
        System.out.println("Creando usuario");

        System.out.println("Introduce el id del usuario");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre del usuario");
        String name = sc.nextLine();
        System.out.println("Introduce la dirección del usuario");
        String address = sc.nextLine();
        System.out.println("Introduce el teléfono del usuario");
        int phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el email del usuario");
        String email = sc.nextLine();
        User user = new User(id, name, address, phone, email);
        System.out.println("Usuario creado: " + user.toString());

        System.out.println("Introduce el usuario");
        String user1 = sc.nextLine();

        System.out.println("Introduce la contraseña");
        System.out.println("La contraseña debe tener al menos 5 caracteres, una letra, un número y un carácter especial");
        String password = sc.nextLine();

        authenticator.setUser(user1);
        authenticator.setPassword(password);

        if (authenticator.authenticate(user1, password)) {
            System.out.println("Usuario autenticado");
        } else {
            System.out.println("Usuario no autenticado");
        }

        System.out.println("Usuario autenticado: " + authenticator.authenticate(user1, password));



    }
}
