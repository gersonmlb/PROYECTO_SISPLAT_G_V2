
package com.plateriaGuadalupe.entity;


public class ClienteEmpresarial {
    private int id;
    private int ruc;
    private String razso;
    private String direccion;
    private int telefono;

    public ClienteEmpresarial(int id, int ruc, String razso, String direccion, int telefono) {
        this.id = id;
        this.ruc = ruc;
        this.razso = razso;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ClienteEmpresarial(String razso,int ruc, String direccion, int telefono) {
        this.ruc = ruc;
        this.razso = razso;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazso() {
        return razso;
    }

    public void setRazso(String razso) {
        this.razso = razso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
