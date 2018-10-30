
package com.plateriaGuadalupe.entity;

public class Persona {
    
    private int id;
    private String nombres;
    private String apeliidos;
    private String DNI;

    public Persona(int id, String nombres, String apeliidos, String DNI) {
        this.id = id;
        this.nombres = nombres;
        this.apeliidos = apeliidos;
        this.DNI = DNI;
    }

    public Persona(String nombres, String apeliidos, String DNI) {
        this.nombres = nombres;
        this.apeliidos = apeliidos;
        this.DNI = DNI;
    }

    public Persona() {
    }

    public Persona(int id) {
        this.id = id;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApeliidos() {
        return apeliidos;
    }

    public void setApeliidos(String apeliidos) {
        this.apeliidos = apeliidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
