
package com.plateriaGuadalupe.entity;

public class Producto {

private int id;
private String nombre;
private double precio;
private int stock;
private int tipo;
private String codigo;
private int NroProd;

    public Producto(int id, String nombre, double precio, int stock, int tipo, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public Producto(String nombre, double precio, int stock, int tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
       
    }

    public Producto(String codigo,String nombre, double precio, int stock, int tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
    }

    public Producto(int NroProd) {
        this.NroProd = NroProd;
    }


    
    
    public Producto() {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNroProd() {
        return NroProd;
    }

    public void setNroProd(int NroProd) {
        this.NroProd = NroProd;
    }
    
    
    
}
