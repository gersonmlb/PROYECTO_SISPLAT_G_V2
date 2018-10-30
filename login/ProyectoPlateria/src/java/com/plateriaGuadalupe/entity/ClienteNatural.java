
package com.plateriaGuadalupe.entity;


public class ClienteNatural {
    
    private int id;
    private String nombre;
    private String apellido;
    private String DNI;

    public ClienteNatural(int id) {
        this.id = id;
    }

    public ClienteNatural(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
