
package com.plateriaGuadalupe.entity;

public class User {
    private String nombre;
    private String apellido;
    private String DNI;
    private int id;
    private String user;
    private String pass;
    private int rol;
    private String direccion;
    private String email;
    private int NroUser;

    public User(int id, String user, String pass, int rol, String direccion, String email) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.rol = rol;
        this.direccion = direccion;
        this.email = email;
    }

    public User() {
    }

    public User(String nombre, String apellido, String DNI, String user, String pass, int rol, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.user = user;
        this.pass = pass;
        this.rol = rol;
        this.direccion = direccion;
        this.email = email;
    }

    public User(String nombre, String apellido, String DNI, String user, String pass, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.user = user;
        this.pass = pass;
        this.direccion = direccion;
        this.email = email;
    }
    
    
    
    
    public User(String email) {
        this.email = email;
    }

    public int getNroUser() {
        return NroUser;
    }

    public void setNroUser(int NroUser) {
        this.NroUser = NroUser;
    }
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    
    
}
