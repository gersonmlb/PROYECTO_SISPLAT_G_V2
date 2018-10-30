
package com.plateriaGuadalupe.entity;

public class detalleVenta {
    private Double precio;
    private int cantidad;
    private int ventaId;
    private String producto;

    public detalleVenta(Double precio, int cantidad, String producto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    
    
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
}
