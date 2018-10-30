
package com.plateriaGuadalupe.entity;


public class Pagos {
    private int id;
    private Double importe;
    private String tipo;
    private String sede;

    public Pagos(Double importe, String tipo, String sede) {
        this.importe = importe;
        this.tipo = tipo;
        this.sede = sede;
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    
}
